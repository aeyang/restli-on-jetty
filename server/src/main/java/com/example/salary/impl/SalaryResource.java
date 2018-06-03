package com.example.salary.impl;

import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.example.salary.Salary;
import com.example.salary.ds.SalarySubmissionDao;

/**
 * Very simple Rest.li Resource to save and lookup Salary
 *
 * @author Alan Yang
 */
@RestLiCollection(name = "salaries", namespace = "com.example.salary")

public class SalaryResource extends CollectionResourceTemplate<Integer, Salary>
{
  private static SalarySubmissionDao salarySubmissionDao = new SalarySubmissionDao();

  @Override
  public Salary get(Integer key) {
    return salarySubmissionDao.getSalarySubmission(key);
  }

  @Override
  public CreateResponse create(Salary salary) {
    return salarySubmissionDao.insertSalarySubmission(salary);
  }
}

