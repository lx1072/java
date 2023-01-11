import java.util.Scanner;

public class test02 {

    //算出当年的几月几日是当年的第多少天
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year,month,date;
        int days = 0;
        System.out.println("请输入日期：");
        System.out.print("年:");
        year = sc.nextInt();
        System.out.print("月:");
        month = sc.nextInt();
        System.out.print("日:");
        date = sc.nextInt();
        for(int i = 1; i < month; i++) {
            switch(i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days +=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days +=30;
                    break;
                case 2:
                    if((year % 4 == 0 && year % 100!=0)||(year % 400 == 0)){
                        days += 29;
                        break;
                    }else {
                        days += 28;
                        break;
                    }
            }
        }
        days=days+date;
        System.out.printf(year+"年"+month+"月"+date+"日是当前年的第"+days+"天");
    }
}