import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int sumOfRight=0,sumOfLeft=0;
        System.out.println("Enter the elements of the martix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = sc.nextInt();
                if(i==j)
                    sumOfLeft=sumOfLeft+mat[i][j];
                if((i+j)==2)
                    sumOfRight=sumOfRight+mat[i][j];
            }
        }
        sc.close();
        System.out.println("The Given 3X3 Matrix is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sum of Left Diagonal is: " + sumOfLeft);
        System.out.println("Sum of Right Diagonal is: " + sumOfRight);
    }
}
