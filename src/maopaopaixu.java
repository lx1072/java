import java.util.Scanner;

public class maopaopaixu {

    public static void main(String[] args) {
        int[] array= {10,9,8,7,6,5,4,3,2,1};
        int[] array1= {10,9,8,7,6,5,4,3,2,1};
        BubbleSort(array);
        ass(array1);
        System.out.println("排序后数组为：");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println("重写");
        for(int i=0;i<array.length;i++)
            System.out.print(array1[i]+" ");
    }

    public static void BubbleSort(int[] array) {
        for(int i=1;i<array.length;i++) {
            for(int j=0;j<array.length-i;j++) {
                int temp;
                if(array[j]>array[j+1]) {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void ass(int arr[]){

        for (int i=1;i< arr.length;i++){
            for (int j=0;j< arr.length-i;j++){
                int tem;
                if (arr[j]>arr[j+1]){
                    tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
//        for (int i=1;i< arr.length;i++){
//            for (int j=0;j< arr.length-i;j++){
//                int tem;
//                if (arr[j]>arr[j+1]){
//                    tem=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=tem;
//                }
//            }
//        }
    }


}
