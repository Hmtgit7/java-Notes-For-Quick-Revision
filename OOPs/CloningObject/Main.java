package OOPs.CloningObject;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ObjectCloning obj1 = new ObjectCloning(10, "Rahul");
        ObjectCloning obj2= (ObjectCloning)obj1.clone();    //shawllo copy of obj1 is created in obj2
        System.out.println(obj1.age + " " + obj1.name);
        System.out.println(obj2.age + " " + obj2.name);
        ObjectCloning obj3 = (ObjectCloning)obj1.deepClone();   //deep copy of obj1 is created in obj3
        obj3.age = 20;
        System.out.println(obj1.age + " " + obj1.name);

    }
}
