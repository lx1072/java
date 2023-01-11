import java.util.Date;

public class Main {
    public static int getComputeAge(int n) {
        int age = 0;
        if (n == 1) {
            age = 10;
        } else {
            age = getComputeAge(n - 1) + 2;
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.println(getComputeAge(3));
    }
}