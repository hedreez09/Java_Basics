package Arrays;

public class SingleDimensionalArray{
    public static void main(String[] args) {
        //Declaring an Array
        //int[] marks;
        //int[] marks = new int[5];

        //initiallizing an Array
        //int[] marks = new int[] {10, 20, 30,40, 50 };
        //Declare and Assign an Array

        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;


        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("************");
        for(int i: marks){
            System.out.println(i);
        }

    }
}
