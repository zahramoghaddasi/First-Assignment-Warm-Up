import java.util.Scanner;

public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public static long factorial(int n) {
        int sum = 1;
        for(int i = 2 ; i <= n ; i++){
            sum = sum * i;
        }
        return sum;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public static long fibonacci(int n){
    if(n == 1){
        return 1;
    }
    else if(n == 2){
        return 1;
    }
    else {
        return fibonacci(n-1)+fibonacci(n-2);
    }
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public static char[][] generateTriangle(int rows){
        char[][] arr = new char[rows][rows];
        for (int i = 0; i < rows; i++) {
            arr[i] = new char[i+1];
            for (int j = 0; j <= i; j++) {
                arr[i][j]= '*';
            }
        }

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        generateTriangle(rows);
    }

}