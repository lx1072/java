public class java02 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);

        int sum1=0;
        for (int x=0;x<=100;x+=2){
            sum1=sum1+x;
        }
        System.out.println(sum1);
    }
}
