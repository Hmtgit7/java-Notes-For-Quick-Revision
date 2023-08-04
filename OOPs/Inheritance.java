package OOPs;
class Box{
    double length;
    double breadth;
    double height;
    Box(){
        this.length = -1;
        this.breadth = -1;
        this.height = -1;
    }
    Box(double side){
        this.length = side;
        this.breadth = side;
        this.height = side;
    }
    Box(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    Box(Box old){
        this.length = old.length;
        this.breadth = old.breadth;
        this.height = old.height;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight(double length, double breadth, double height, double weight){
        super(length, breadth, height);
        this.weight = weight;
    }
    BoxWeight(BoxWeight old){
        super(old);
        this.weight = old.weight;
    }

}
public class Inheritance {
    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box(10);
        Box box3 = new Box(10, 20, 30);
    }
}