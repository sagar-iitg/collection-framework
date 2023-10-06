import java.util.Vector;


public class VectorExample {


    public static void main(String[] args) {


        Student s=new Student(3,"ankit");
        Vector<Student> v=new Vector<>();

        //Create
        v.add(new Student(1,"sagar"));
        v.add(new Student(2,"mohit"));
        v.addElement(s);
        System.out.println(v);


        //Read
        System.out.println(v.get(0));


        //update
        v.set(1,new Student(4,"mh"));
        System.out.println(v);

        //delete
        v.remove(1);
        System.out.println(v);

        int x=v.capacity();
        //size of vector
        int sz=v.size();
        System.out.println(x+ " "+sz);

        //searching


        System.out.println(v.contains(s));







    }
}
