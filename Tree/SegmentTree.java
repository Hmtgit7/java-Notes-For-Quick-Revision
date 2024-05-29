package Tree;

public class SegmentTree {
    public class Node{
        int startInterval;
        int endInterval;
        int data;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr){
        this.root=constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start==end){
            //leaf Node

            Node leaf=new Node(start, end);
            leaf.data=arr[start];
            return leaf;
        }

        Node node= new Node(start, end);
        
        int mid=(start+end)/2;

        node.left=constructTree(arr, start, mid);
        node.right=constructTree(arr, mid+1, end);  

        node.data=node.left.data+node.right.data;   

        return node;
    }
}