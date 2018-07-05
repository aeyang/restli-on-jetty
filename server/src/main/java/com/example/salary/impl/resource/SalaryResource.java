package com.example.salary.impl.resource;

import com.example.salary.impl.service.SalaryService;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.example.salary.Salary;

/**
 * Very simple Rest.li Resource to save and lookup Salary
 *
 * @author Alan Yang
 */
@RestLiCollection(name = "salaries", namespace = "com.example.salary")

public class SalaryResource extends CollectionResourceTemplate<Integer, Salary>
{
  private static SalaryService salaryService = new SalaryService();

  @Override
  public Salary get(Integer key) {
    return salaryService.getSalaryById(key);
  }

  /**
   * This method won't work bc RestLi doesn't recognize a method called "getByTitle".
   */
  public Salary getByTitle(String title) {
    return salaryService.getSalaryByTitle(title);
  }

  @Override
  public CreateResponse create(Salary salary) {
    return salaryService.createSalary(salary);
  }
}

