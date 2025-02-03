package error.example1;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student implements Comparable<Student>{
    int id;
    String name;

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
public class Main {

    public static void main(String[] args) {


        Student s2=new Student(456,"aa");
        Student s1=new Student(123,"sagar");
        Student s3=new Student(1243,"zz");
        List<Student> list= new ArrayList<>(Arrays.asList(s1,s2,s3));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
