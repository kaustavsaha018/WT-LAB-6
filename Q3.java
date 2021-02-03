import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("The Sorted Arraylist is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
