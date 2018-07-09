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
  private static SalarySubmissionDao _salarySubmissionDao;

  public SalaryService(SalarySubmissionDao salarySubmissionDao) {
    _salarySubmissionDao = salarySubmissionDao;
  }

  public Salary getSalaryById(Integer key) {
    return _salarySubmissionDao.getSalarySubmission(key);
  }

  public Salary getSalaryByTitle(String title) {
    return _salarySubmissionDao.getSalarySubmission(title);
  }

  public CreateResponse createSalary(Salary salary) {
    return _salarySubmissionDao.insertSalarySubmission(salary);
  }
}
