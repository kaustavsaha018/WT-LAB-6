public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        int oddCount=0,evenCount=0;
        for(int i=0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
            if(arr[i]%2==0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Total odd numbers is: " + oddCount);
        System.out.println("Total even numbers is: " + evenCount);
    }
}
