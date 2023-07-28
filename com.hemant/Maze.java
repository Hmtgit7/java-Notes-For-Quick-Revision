public class Maze{
    public static void main(String[] args){
        maze("", 3, 3);
    }
    public static void maze(String up, int row , int col){
        if(row==1&&col==1){
            System.out.println(up);
            return;
        }
        if(row>1){
            maze(up+'D',row-1,col);
        }
        if(col>1){
            maze(up+'R',row,col-1);
        }
    }
}