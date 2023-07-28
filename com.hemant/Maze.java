public class Maze{
    public static void main(String[] args){
        maze("", 3, 3);
    }
    public static void maze(String up, int row , int col){
        int count =0;
        if(row==1&&col==1){
            System.out.println(up);
            System.out.println(count);
            return;
        }
        if(row>1){
            maze(up+'D',row-1,col);
            count++;
        }
        if(col>1){
            maze(up+'R',row,col-1);
            count++;
        }
    }
}