public class example1 {



    public static void main(String[] args) {
        System.out.println(a(2));
        System.out.println(b(8));
    }

    public static int a(int a){
        if (a==1){
            return 10;
        }else return a(a-1)+2;
    }

    /*
     * 题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长
     * 到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
     * 程序分析：  实际月份  1    2    3    4    5    6    7     8
     *             幼仔对数  1    0    1    1    2    3    5     8
     *             成兔对数  0    1    1    2    3    5    8     13
     *             总体对数  1    1    2    3    5    8    13    21
     *             幼仔对数=前月成兔对数
     *             成兔对数=前月成兔对数+前月幼仔对数
     *             总体对数=本月成兔对数+本月幼仔对数
     *             可以看出幼仔对数、成兔对数、总体对数都构成了一个数列。这个数
     *             列有关十分明显的特点，那是：前面相邻两项之和，构成了后一项。
     */
    public static int b(int b){
        if (b==1||b==2){
            return 1;
        }else return b(b-1)+b(b-2);
    }



}
