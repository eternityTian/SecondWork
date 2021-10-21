import java.util.Scanner;

public class Lv1 {
    /**
     * 打印九九乘法表and五角星
     *
     * @author zhihong
     * @id 2021211945
     *
     */
    public static void main(String[] args) {
        //打印乘法表
        haskell();

        System.out.println("请输入要打印星星的大小（所占行数）:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        star(a);//打印a行数的星星
        
    }

    //乘法表
    static void haskell(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+i+"="+(i*i)+" ");
            }
            System.out.println();
        }
    }

    //五角星 传入行数
    static void star(int hang){

        /**
         *  -,- 从最开始拿20行调到最后我都给乱了，这个星星，让我写注释？不可能的。
         *  除了神，没有第二个能看懂我代码的（写完我也看不懂了）
         *            ╮(╯▽╰)╭
         */
        for (int i = 0; i < hang; i++) {
            int temp = 0;
            while(temp<2*hang+hang/2){
                if(temp>(2*hang+hang/2)/2-1-i&temp<(2*hang+hang/2)/2+1+i&i<hang/5+1){
                    System.out.print("*");
                }else if(temp>2+3*(i-(hang/5+1))&&temp<(2*hang+hang/2)-2-3*(i-(hang/5+1))&i>=(hang/5+1)&i<hang/2+1){
                    System.out.print("*");
                }else if(temp>(2*hang+hang/2)/2-1-i&temp<(2*hang+hang/2)/2+1+i&i<hang/1.6){
                    System.out.print("*");
                }else if(temp>(2*hang+hang/2)/2-1-i&temp<(2*hang+hang/2)/2-3*(i-hang/1.6)&i>=hang/1.6){
                    System.out.print("*");
                }else if(temp>(2*hang+hang/2)/2+3*(i-hang/1.6)&temp<=(2*hang+hang/2)/2+i&i>=hang/1.6){
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }

                temp++;
            }
            System.out.println();
        }
    }
}
