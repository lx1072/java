import java.util.Scanner;

public class digui {
    public static void main(String[] args) {
        //输出第n项的值
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第n项的值:");
        int n = Integer.parseInt(scan.nextLine().trim());
        System.out.println("f("+n+")="+f(n));
        //输出前n项所有数据 每5个换一行
        System.out.println("前 "+n+" 项的斐波那契数列为：");
        for(int i=1;i<=n;i++){
            System.out.print(f(i)+"\t");
            if(i%5==4){
                System.out.println();
            }
        }
    }
    public static long f(int n){	//递归
        if(n == 1 || n == 2){//参数1或者2时
            return 1;
        }else{
            return f(n - 1) + f(n - 2);
        }
    }
}
