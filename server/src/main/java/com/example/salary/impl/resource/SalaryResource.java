package com.example.salary.impl.resource;

import com.example.salary.impl.service.SalaryService;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.example.salary.Salary;
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
  private static SalaryService _salaryService;

  public SalaryResource() {
    // I can't just do constructor dependency injection here like I can for SalaryService because Rest.li
    // creates these Resources.
    // What is best practice for where to put these xml files?
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:com/example/salary/impl/dependencies.xml");
    _salaryService = context.getBean("salaryService", SalaryService.class);
  }

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

