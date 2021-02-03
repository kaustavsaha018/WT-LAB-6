public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for(int i=0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        int temp=0;
        for(int i=0;i<args.length;i++){
            for(int j=i+1;j<args.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The largest number is: " + arr[0]);
    }
}