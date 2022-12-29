package com.peaksoft;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BD {
    private static String URL="jdbc:postgresql://localhost:5433/postgres";
    private static String USERNAME="postgres";
    private static String PASSWORD = "postgres";

    public static Connection connection (){
        Connection conn = null;
        try {
            conn= DriverManager.getConnection(URL,USERNAME, PASSWORD);
            System.out.println("Successfully connected");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }



}
