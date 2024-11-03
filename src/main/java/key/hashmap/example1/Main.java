package key.hashmap.example1;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

@Getter
@Setter
@ToString
class Employee{
    private long id;
    private String name;
    private Date dateOfBirth;
    private BigDecimal salary;
}

public class Main {
    public static void main(String[] args) {
        HashMap<Employee,String> employeeMap = new HashMap<Employee,String>();
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Sachin");
        employee1.setDateOfBirth(new Date(1987,2,1));
        employee1.setSalary(new BigDecimal(100000));
        employeeMap.put(employee1,"India");
        // Some Business logic
        // In the second Operation I am updating the same employee with the newly initailized Employee Object

        Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setName("Sachin");
        employee2.setDateOfBirth(new Date(1987,2,1));
        employee2.setSalary(new BigDecimal(100000));

        // Here we wanted to update the same Employee to Japan
        employeeMap.put(employee2,"Japan");
        System.out.println(employeeMap);


    }
}
