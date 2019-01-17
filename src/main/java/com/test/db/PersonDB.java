package com.test.db;

import com.test.bean.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonDB {

    public void insert(Person person) {
        try(Connection conn = Conn.getConnection()) {

            String sql = "insert into person(username, password, age) values(?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, person.getUsername());
            ps.setString(2, person.getPassword());
            ps.setInt(3, person.getAge());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Person person) {
        try (Connection conn = Conn.getConnection()) {
            String sql = "update person set username = ?, password = ?, age = ? where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, person.getUsername());
            ps.setString(2, person.getPassword());
            ps.setInt(3, person.getAge());
            ps.setInt(4, person.getId());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Person getById(int id) {
        Person person = null;

        try (Connection conn = Conn.getConnection()) {
            String sql = "select * from person where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();


            if (resultSet.next()) {
                person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setUsername(resultSet.getString("username"));
                person.setPassword(resultSet.getString("password"));
                person.setAge(resultSet.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }

    public void removeById(int id) {
        try (Connection conn = Conn.getConnection()) {
            String sql = "delete from person where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
