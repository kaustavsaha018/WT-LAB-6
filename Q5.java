import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int[] occur = new int[9999];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            occur[arr[i]]++;
        }
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    arr[j]=-1;
            }
        }
        System.out.println("Occurences:");
        for(int i=0;i<n;i++){
            if(arr[i]!=-1)
                System.out.println(arr[i] + " occured " + occur[arr[i]] + " times");
        }

    }
}
