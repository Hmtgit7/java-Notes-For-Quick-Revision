package OOPs;

class Student{
    int rollNo;
    String name;
    public String toString(){
        return "Roll No: "+rollNo+" Name: "+name;
    }
}
public class ConceptOFClass {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj);
        obj.rollNo = 1;
        obj.name = "Hemant";
        System.out.println(obj);
        
    }
}
