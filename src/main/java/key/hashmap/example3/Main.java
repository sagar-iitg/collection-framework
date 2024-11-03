package key.hashmap.example3;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@ToString
class Employee{
    private long id;
    private String name;
    private Date dateOfBirth;
    private BigDecimal salary;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

//        if (id != employee.id) return false;
//        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
//        if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null) return false;
//        return salary != null ? salary.equals(employee.salary) : employee.salary == null;


        return Long.compare(id,employee.id)==0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth) &&
                Objects.equals(salary, employee.salary);


    }


    @Override
    public int hashCode() {

//        int result = (int) (id ^ (id >>> 32));
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
//        result = 31 * result + (salary != null ? salary.hashCode() : 0);
//        return result;

        return Objects.hash(id,name,dateOfBirth,salary);

    }


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



        for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
            System.out.println(employeeStringEntry.getKey().hashCode());
        }
        // Step 2
        // Mutating the Employee Object
        employee1.setName("Rahul");

        for (Map.Entry<Employee, String> employeeStringEntry : employeeMap.entrySet()) {
            System.out.println(employeeStringEntry.getKey().hashCode());
        }
        System.out.println(employeeMap.get(employee1));


        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setName("Sachin1");
        employee2.setDateOfBirth(new Date(1987,2,1));
        employee2.setSalary(new BigDecimal(100000));
        employeeMap.put(employee2,"Hello employee2");
        System.out.println(employeeMap.get(employee2));
        employee2.setId(10);
        System.out.println(employeeMap.get(employee2));

        System.out.println(employeeMap);


    }
}
