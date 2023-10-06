import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {


        Stack<String> st=new Stack<>();


        System.out.println(st.empty());

        st.add("Sagar");
        st.add("Mohit");
        st.add("Ankit");
        st.add("Arpit");


        st.push("nitin");
        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.empty());
        System.out.println("Size of stack is");

        System.out.println(st.size());
        System.out.println(st.search("Mohit"));


    }
}
