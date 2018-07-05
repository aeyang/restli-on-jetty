package com.example.salary.impl.service;

import com.example.salary.Salary;
import com.example.salary.impl.ds.SalarySubmissionDao;
import com.linkedin.restli.server.CreateResponse;


/**
 * Very simple Salary Service to look up salaries
 *
 * @author alyang
 */
public class SalaryService {
  private static SalarySubmissionDao salarySubmissionDao = new SalarySubmissionDao();

  public Salary getSalaryById(Integer key) {
    return salarySubmissionDao.getSalarySubmission(key);
  }

  public Salary getSalaryByTitle(String title) {
    return salarySubmissionDao.getSalarySubmission(title);
  }

  public CreateResponse createSalary(Salary salary) {
    return salarySubmissionDao.insertSalarySubmission(salary);
  }
}
