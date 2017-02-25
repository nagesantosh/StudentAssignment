package com.synerzip.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import com.synerzip.model.StudentModel;

public class DBHelper {

  /**
   * Gets the connection.
   *
   * @return the connection
   */
  public Connection getConnection() {
    try {
      Connection con =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "synerzip");
      System.out.println("connection established");
      return con;
    } catch (SQLException e) {
       e.printStackTrace();
    }
    return null;
  }
}
