public class Lv2 {
    /**
     *
     * @author zhihong
     * @id 2021211945
     * @content 冒泡排序和选择排序
     *
     * */

    //测试
    public static void main(String[] args) {
        Lv2 test = new Lv2();
        int nums[] = {5,6,2,7,8,10,65,3,4};//随机定义一个数组
        System.out.println("原数组：");
        test.printArr(nums);//打印数组

        nums = test.bubblingSort(nums);//进行冒泡排序(从小到大）
        test.printArr(nums);//打印排序后的数组

        nums = test.selectSort(nums);//进行选择排序（从大到小）
        test.printArr(nums);
    }

    //遍历打印数组
    public void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //冒泡排序（小-->大）
    public int[] bubblingSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {//前者大于后者交换位置
                    int temp;//中间量
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    //选择排序（大-->小）
    public int[] selectSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {//遍历数组,寻找第i+1大的数放到第i位
            int maxIndex=i,max=arr[i];//存放该位应该最大数的位置和最大数
            for (int j = i+1; j < arr.length; j++) {//寻找剩下数中最大值
                if (arr[j] > max) {//如果大于max，改变最大值和标记位置
                    maxIndex = j;
                    max = arr[j];
                }
            }
            if (maxIndex != i) {//如果本身不是最大的，放入该位置应该的最大值
                int temp = arr[i];//中间量
                arr[i] = arr[maxIndex];//
                arr[maxIndex] = temp;
            }
        }
        return arr;
    }

}
