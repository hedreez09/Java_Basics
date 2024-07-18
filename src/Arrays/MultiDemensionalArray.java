package Arrays;

public class MultiDemensionalArray {
    public static void main(String[] args) {

        int marks[][]  ={
                {56,67,45,34,45},
                {57,57,68,56,45},
                {57,57,68,56,45}
        };
        for(int i = 0; i<3; i++){
            for(int j= 0; j < 5; j++){
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

