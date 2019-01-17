package com.test.db;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class ConnTest {

    @Test
    public void testGetConnection() {
        Connection conn = Conn.getConnection();

        assertNotNull(conn);
    }
}