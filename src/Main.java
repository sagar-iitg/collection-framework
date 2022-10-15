public class Main {


    public static void main(String[] args) {




            Student s=new Student(1,"sagar");
            Student s1=new Student(1,"sagar");

            System.out.println(s.hashCode());
            System.out.println(s1.hashCode());
            System.out.println(s.equals(s1));



    }
}
