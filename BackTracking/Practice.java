package BackTracking;

public class Practice {

    public static boolean isSafe(int suduko[][],int row ,int col, int digit){
        for(int i =0;i<9;i++){
            if(suduko[i][col]== digit){
                return false;
            }
        }

        for(int j=0;j<9;j++){
            if(suduko[row][j]== digit){
                return false;
            }
        }
        int sr= (row/3)*3;
        int sc =(col/3)*3;
        for(int i =sr ;i<sr+3;i++){
            for(int j=sc ;j<sc+3;j++){
                if(suduko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int suduko[][],int row,int col){
        // base case 
        if(row ==9){
            return true;
        }

            int nextRow = row, nextCol = col;
            if(col +1 ==9){
                nextRow = row+1;
                nextCol =0;
            }else{
                nextCol =col+1;
            }

            if(suduko[row][col]!=0){
                return sudokuSolver(suduko, nextRow, nextCol);
            }

            for(int digit = 1;digit<=9;digit++){
                if(isSafe(suduko,row,col,digit)){
                    suduko[row][col]=digit;

                    if(sudokuSolver(suduko, nextRow, nextCol)){
                        return true;
                    }

                    suduko[row][col]=0;  // step of backtracking
                }
            }
            return  false;
        
    }

    public static void printSudduo(int suduko[][]){
        for(int i =0;i<9;i++){
            if(i%3 ==0 && i!=0){
                System.out.println("------------------------");
            }
            for(int j =0;j<9;j++){
                if(j%3==0 && j!=0){
                    System.out.print("| " );
                }
                System.out.print(suduko[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int suduko[][]={
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3},
        };

        if(sudokuSolver(suduko, 0, 0)){
            System.out.println("solution exists:");
            printSudduo(suduko);
        }else{
            System.out.println("soliion not exists");
        }
    }
    
}
