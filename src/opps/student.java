package opps;

public class student {

    int studentId;
    String studentName;
    String studentCity;

    public student(){
        System.out.println("creating constructor");
    }

    public student(int i, String n, String c){
        studentId = i;
        studentName =n;
        studentCity = c;
    }

    public void study(){

        System.out.println(studentName +" is studying");
    
    }

    public void studentDetails(){
        System.out.println("my name is "+ studentName);
        System.out.println(studentCity);
        System.out.println(studentId);


    }

}
