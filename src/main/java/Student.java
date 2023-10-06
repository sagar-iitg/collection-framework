public class Student {


    private int rollNo;
    private String name;


    public Student(){}

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "(" +rollNo +
                "," + name+ ")";
    }
}
