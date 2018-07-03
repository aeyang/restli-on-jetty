package com.example.salary.ds;

import com.example.salary.Salary;
import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.server.CreateResponse;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SalarySubmissionDao {

  private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/alyang";
  private static final String USER = "alyang";
  private Connection dbConnection;

  public SalarySubmissionDao() {

    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(DATABASE_URL);
    config.setUsername(USER);

    try {
      HikariDataSource dataSource = new HikariDataSource(config);
      dbConnection = dataSource.getConnection();
    } catch (SQLException e) {
      System.out.println("Failed to connect to Database");
    }
  }

  public Salary getSalarySubmission(Integer key) {

    Salary salary = new Salary();
    String preparedSelectStatement = "SELECT * FROM salary_submission WHERE key = ?";

    try {
      PreparedStatement pst = dbConnection.prepareStatement(preparedSelectStatement);
      pst.setInt(1, key);
      System.out.println("----- Executing DB SELECT ------");
      ResultSet results = pst.executeQuery();

      // Move cursor to first
      if (results.next()) {
        String company = results.getString("company");
        String region = results.getString("region");
        String title = results.getString("title");
        long low = results.getLong("low");
        long high = results.getLong("high");

        salary.setCompany(company).setRegion(region).setTitle(title).setLow(low).setHigh(high);
      }
    } catch (SQLException e) {
      System.out.println(e);
    }

    return salary;
  }

  public CreateResponse insertSalarySubmission(Salary salary) {
    String preparedInsertStatement =
        "INSERT INTO salary_submission(key, title, company, region, low, high) VALUES(?, ?, ?, ?, ?, ?)";
    try {
      PreparedStatement pst = dbConnection.prepareStatement(preparedInsertStatement);
      pst.setInt(1, 1);
      pst.setString(2, salary.getTitle());
      pst.setString(3, salary.getCompany());
      pst.setString(4, salary.getRegion());
      pst.setDouble(5, salary.getLow());
      pst.setDouble(6, salary.getHigh());

      System.out.println("----- Executing DB Update -----");
      pst.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e);
    }

    return new CreateResponse(HttpStatus.S_202_ACCEPTED);
  }
}
