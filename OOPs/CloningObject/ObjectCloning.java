package OOPs.CloningObject;

public class ObjectCloning implements Cloneable {
    int age;
    String name;

    ObjectCloning(int age, String name) {
        this.age = age;
        this.name = name;
    }

    ObjectCloning(ObjectCloning obj) {
        this.age = obj.age;
        this.name = obj.name;
    }

    ObjectCloning() {
        System.out.println("ObjectCloning constructor");
    }
    //shawllo copy
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    //deep copy
    public Object deepClone() throws CloneNotSupportedException{
        ObjectCloning obj = new ObjectCloning();
        obj.age = this.age;
        obj.name = this.name;
        return obj;
    }
}