public class java01 {

    public static void main(String[] args) {
        for (int i=1;i<=15;i++){
            if (i%3==0){
                continue;
            }
            System.out.println(i);
        }
        int i=105;
        while (true){
            if (i++>105){
                break;
            }
            System.out.println(i);
        }
    }
}
