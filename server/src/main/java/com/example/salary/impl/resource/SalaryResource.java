package com.example.salary.impl.resource;

import com.example.salary.impl.service.SalaryService;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.example.salary.Salary;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Very simple Rest.li Resource to save and lookup Salary
 *
 * @author Alan Yang
 */
@RestLiCollection(name = "salaries", namespace = "com.example.salary")
public class SalaryResource extends CollectionResourceTemplate<Integer, Salary>
{

  /**
   * Rest.li uses JSR-330 annotation to inject beans.  When rest.li's spring bridge, all spring beans are available.
   */
  @Inject
  @Named("salaryService")
  private static SalaryService _salaryService;

  @Override
  public Salary get(Integer key) {
    return _salaryService.getSalaryById(key);
  }

  /**
   * This method won't work bc RestLi doesn't recognize a method called "getByTitle".
   */
  public Salary getByTitle(String title) {
    return _salaryService.getSalaryByTitle(title);
  }

  @Override
  public CreateResponse create(Salary salary) {
    return _salaryService.createSalary(salary);
  }
}

