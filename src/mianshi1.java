import java.util.ArrayList;
import java.util.Scanner;

/**
 * 编写程序，
 * 输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。
 * @author Administrator
 *
 */
public class mianshi1 {

    public static void main(String[] args) {
        System.out.println("请输入一个字母");
        Scanner input = new Scanner(System.in);
        char num = input.next().charAt(0);
        ArrayList list=new ArrayList();
        list.add(num);
        //原来这里要看ascii码表，大写字母A-Z是65-90
        //小写字母的是97-122
        if(num>=97 && num<=122) {//如果输入的字母范围在97-122之间，就是小写字母

            char num1 = (char) (num-32);
            System.out.println("大写字母为"+num1);
        }else {
            System.out.println("您输入的不是小写字母。");
        }



    }

}
