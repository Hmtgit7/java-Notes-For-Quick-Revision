package OOPs;

class Student{
    int rollNo;
    String name;
    public String toString(){
        return "Roll No: "+rollNo+" Name: "+name;
    }
}
class Java{
    void display(){
        System.out.println("Iam java");
    }
}
class JavaScript{
    void display(){
        System.out.println("Iam javascript");
    }
}

class programmingLanguage extends Java{
    Java java = new Java();
    JavaScript javascript = new JavaScript();
    void display(){
        java.display();
        javascript.display();
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
