package opps;

public class demo {
    public static void main(String[] args) {
        student str1;

        str1 = new student();
        str1.studentName = "atik";
        str1.studentId = 123 ;
        str1.studentCity = "dhaka";

        str1.study();
        str1.studentDetails();


        student st2 = new student(786, "atik", "rangpur");

       // st2.studentCity = "rangpur";
       // st2.studentId = 234;
       // st2.studentName = "hridoy";

        st2.study();
        st2.studentDetails();
    }

}
