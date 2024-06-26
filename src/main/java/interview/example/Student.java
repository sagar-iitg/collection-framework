package interview.example;


import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private int id;
    private  String firstName;
    private  String lastName;
    private int age;
    private String gender;
    private  String departmentName;
    private int joinedYear;
    private String city;
    private int rank;

    public static void main(String[] args) {
        List<Student> list =
                Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),

                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),

                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),

                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),

                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),

                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),

                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),

                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),

                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),

                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));



        // Find list of students whose first name starts with alphabet A


        /*
             SELECT * FROM students
             WHERE first_name LIKE 'A%';
         */


        List<Student> studentList= list.stream().
                filter(s -> s.getFirstName().
                        startsWith("A")).
                toList();

        System.out.println(studentList);


        // Group The Student By Department Names

        Map<String, List<Student>> studentListMap = list.stream().
                collect(Collectors.groupingBy(Student::getDepartmentName));


        for (Map.Entry<String,List<Student>> ele:studentListMap.entrySet()) {
            System.out.println("---");
            System.out.println(ele.getKey()+" "+ele.getValue());
            System.out.println("---");

        }

        //  Find the max age of student

        /*

         SELECT MAX(age) AS max_age
         FROM students;

        */

        OptionalInt maxAge = list.stream().mapToInt(Student::getAge).max();
        System.out.println(maxAge);

        //Find all departments names
        Set<String> deptName = list.stream().map(Student::getDepartmentName).collect(Collectors.toSet());
        System.out.println(deptName);

       // Find the count of student in each department

        Map<String, Long> countStudentInDepartment = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));
        System.out.println(countStudentInDepartment);

        System.out.println(list.size());

        //Find the list of students whose age is less than 30
        List<Student> studentAgeList = list.stream().
                filter(x -> x.getAge() < 30).
                toList();

        System.out.println(studentAgeList);

        //Find the list of students whose rank is in between 50 and 100

        List<Student> studentRank = list.stream().
                filter(x -> x.getRank() >= 50 && x.getRank() <= 100).
                toList();

        System.out.println(studentRank);

        //Find the average age of male students
        double maleAge = list.stream().filter(x -> Objects.equals(x.getGender(), "Male")).
                mapToInt(Student::getAge).average().orElse(0);

        System.out.println(maleAge);

        //Find the average age of male and female students

        Map<String, Double> mapAvg = list.stream().collect(
                Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge))
        );
        System.out.println(mapAvg);

        // count the no of student in each department
        Map<String,Long> studentNo=list.stream().collect(Collectors.groupingBy(Student::getDepartmentName,Collectors.counting()));
        System.out.println(studentNo);

        // Find the department who is having maximum number of students
        Map.Entry<String, Long> stringLongEntry = list.stream().
                collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting())).
                entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry);



        // Find the list of students and sort them by their rank

        System.out.println();
        System.out.println("Find the list of students and sort them by their rank");
        System.out.println();
        List<Student> list1 = list.stream().sorted(Comparator.comparing(Student::getRank)).toList();
        System.out.println(list1);

        // Find the student who has second rank

        Student student = list.stream().
                sorted(Comparator.comparing(Student::getRank)).
                skip(1).findFirst().get();
        System.out.println(student);

        // Find the highest rank in each department
        System.out.println();
        System.out.println("Find the highest rank in each department");
        System.out.println();
        Map<String, Optional<Student>> highestRankInDept = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(highestRankInDept);


        // Find the average rank in all departments
        System.out.println();
        System.out.println(" Find the average rank in all departments");
        System.out.println();

        Map<String, Double> avgRank = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.averagingInt(Student::getRank)));
        System.out.println(avgRank);

        // Find the Students who stays in Delhi and sort them by their names
        System.out.println();
        System.out.println("Find the Students who stays in Delhi and sort them by their names");
        System.out.println();

        List<Student> stList = list.stream().filter(x -> x.getCity().equalsIgnoreCase("DElhi")).sorted(Comparator.comparing(Student::getFirstName)).toList();

        System.out.println(stList);


    }


}
