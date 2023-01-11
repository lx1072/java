public class paixu2 {

    /**
     * 4、 排序有哪几种方法？请列举。并用JAVA实现一个快速排序.
     * 排序的方法有：冒泡排序、快速排序、选择排序、插入排序。。。
     *
     * @author 281167413@qq.com
     */
        static int count = 0;
        public static void main(String[] args) {
            int values[] = { 5, 4, 8, 3, 7, 2, 1, 9, 0, 6 };

            qsort(values, 0, (values.length - 1));

            System.out.printf("\n\n排序后的结果是：");
            for (int i = 0; i < values.length; i++) {
                System.out.printf("%d ", values[i]);
            }
        }
        public static void qsort(int values[], int left, int right) {
            int tmp = 0;

            System.out.printf("\n这个是第%d次排序的结果：", count);
            count++;
            for (int i = 0; i < values.length; i++) {
                System.out.printf("%d ", values[i]);
            }

            if (left < right) {
                tmp = partition(values, left, right);
                qsort(values, left, tmp);
                qsort(values, tmp + 1, right);
            }
        }

        public static int partition(int values[], int left, int right) {
            int i = 0, j = 0;
            int key = 0, tmp = 0;

            if (null == values) {
                return 0;
            }
            i = left;
            j = right;
            key = values[left];

            // 这个while循环可以实现排序的第一步：分组
            while (i < j) {
                while (values[j] > key) {
                    --j;
                }
                tmp = values[i];
                values[i] = values[j];
                values[j] = tmp;

                while (values[i] < key) {
                    i++;
                }
                tmp = values[i];
                values[i] = values[j];
                values[j] = tmp;
            }

            return i;

    }
}
