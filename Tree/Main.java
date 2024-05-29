package Tree;

public class Main {
    public static void main(String[] args){
        BST tree = new BST();
        int[] nums = {5, 3, 7, 1, 4, 6, 8};
        tree.populate(nums);
        tree.display();

        tree.PreOrder();
        tree.InOrder();
        tree.PostOrder();
    }
}