/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.example.salary.impl;

import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.example.salary.Salary;
import com.linkedin.restli.server.annotations.RestMethod;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * Very simple Rest.li Resource to save and lookup Salary
 *
 * @author Alan Yang
 */
@RestLiCollection(name = "salaries", namespace = "com.example.salary")

public class SalaryResource extends CollectionResourceTemplate<Long, Salary>
{
  String databaseUrl = "jdbc:postgresql://localhost:5432/alyang";
  String user = "alyang";
  String preparedInsertStatement = "INSERT INTO salary_submission(key, title, company, region, low, high) VALUES(?, ?, ?, ?, ?, ?)";
  Connection dbConnection;

  public SalaryResource() {
    try {
      dbConnection = DriverManager.getConnection(databaseUrl);
    } catch (SQLException e) {
      System.out.println("Failed to connect to Database");
    }
  }

  @Override
  public Salary get(Long key)
  {
    return new Salary()
        .setCompany("LinkedIn")
        .setRegion("San Francisco Bay Area")
        .setTitle("Software Engineer")
        .setHigh(10000)
        .setLow(80000);
  }

  @Override
  public CreateResponse create(Salary salary) {
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

