public class Test1 {
    public static void main(String[] args) {
        System.out.println(getage(8));

    }
    public static int getage(int n){
        int age=0;
        if (n==1){
            age=10;
        }else {
            age = getage(n-1 )+ 2;
        }return age;
    }
}
