import java.util.Arrays;

public class aaa {

    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48} ;
        int j;
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            for (j=i-1;j>=0&&arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
