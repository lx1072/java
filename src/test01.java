import java.util.Scanner;

//将字符串转换大小写
public class test01 {
    public static void main(String[] args) {
        String hello="Hello World";
        char[] chars=hello.toCharArray();
        for (int i=0;i<chars.length;i++){
            int a=chars[i];
            if (a>96&&a<122){
                int b =a-32;
                chars[i]=(char)b;
            }
        }
        System.out.println(chars);
        System.out.println(hello.replaceAll("o","*"));
    }
}
