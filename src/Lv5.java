import java.util.ArrayList;

public class Lv5 {

    //测试MutableArrayList 类
    public static void main(String[] args) {

        MutableArrayList m1 = new MutableArrayList(10);
        m1.add("n1");
        m1.add("n2");
        m1.add("n3");
        m1.add("n4");
        m1.add(3,"hhhh");
        m1.remove(3);
        m1.add("Android");
        m1.remove("n2");
        for (int i = 0; i < m1.getSize(); i++) {
            System.out.println(m1.get(i));
        }
        System.out.println("list内拥有：" + m1.getSize() + "个元素");
    }
}
