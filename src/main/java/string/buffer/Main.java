package string.buffer;

public class Main {


    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb = new StringBuffer();
        sb.append("Hello Sagar Kumar");
        sb.append(" nice");

        sb.insert(6,"rahul ");
        String str=sb.toString();
        System.out.println(str);

        //constructor2
        StringBuffer sb2=new StringBuffer("sagar kumar");

        //constructor 3
        StringBuffer sb3=new StringBuffer(30);


    }


}
