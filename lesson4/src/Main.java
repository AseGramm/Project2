public class Main {
    public static void main(String[] args) {
        int[] arr={1,3,9,7,5};
        int imax=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[imax]){
                imax=i;
            }
        }
        System.out.print("Максимальное число:");
        System.out.println(arr[imax]);
    }
}
