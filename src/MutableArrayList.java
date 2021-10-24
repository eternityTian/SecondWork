/**
 * @author zhihong
 * @id 2021211945
 * @time 2021.10.23
 * @content 自己的一个ArrayList
 *
 */
public class MutableArrayList {
    //声明一个Object类型的数组
    private Object[] elementDate;
    //声明一个数组内元素个数
    private int size = 0;
    //声明一个数组内null元素个数
    private int nullSize;
    //声明一个数组的长度
    private int length;

    public MutableArrayList(){
        this.size = 0;
        nullSize = 0;
    }

    /**
     * @param size 初始化容器容量
     */
    public MutableArrayList(int size){
        this.length = size;
        this.nullSize = size;
        elementDate = new Object[this.length];

    }

    /**
     * @param obj 所添加元素
     */
    public void add(Object obj){
        size++;
        if (size > length) {//如果加入新元素后元素个数大于数组长度，进行扩容
            length = (int)(1.5*length) + 1;//1.5倍扩容
            Object[] temp = new Object[length];//中间数组
            int i;
            for (i = 0; i < size-1; i++) {
                temp[i] = elementDate[i];//将已有元素copy
            }
            temp[i] = obj;//添加新元素
            elementDate = temp;//重置数组
        }else {
            for (int i = 0; i < elementDate.length; i++) {//遍历当前elementDate,遇到null传入数据
                if (elementDate[i] == null) {
                    elementDate[i] = obj;
                    break;
                }
            }
        }
    }

    /**
     *
     * @param index 位置
     * @param obj 所加元素
     */
    public void add(int index,Object obj){
        if (index <= size) {
            Object temp = elementDate[index];//把该位置元素暂存
            elementDate[index] = obj;
            for (int i = index+1; i <= getSize(); i++) {
                Object temp2 = elementDate[i];//暂存当前
                elementDate[i] = temp;//将上一个暂存放入当前
                temp = temp2;
            }
            size++;
        }else {//index超出数组元素总数
            System.out.println("index超出数组大小，中间省略很多元素，所以存入失败");
        }
    }

    /**
     * 得到index位置的元素
     * @param index 位置
     * @return 元素
     */
    public Object get(int index){
        if (isIndex(index)) {
            return elementDate[index];
        }else {
            System.out.println("该index不存在,返回null");
            return null;
        }
    }

    /**
     *
     * @param obj 要删除的元素
     */
    public void remove(Object obj){
        boolean b = false;//判断是否找到该元素
        for (int i = 0; i < getSize(); i++) {
            if (obj.equals(elementDate[i])) {
                for (int j = i; j < getSize(); j++) {
                    elementDate[j] = elementDate[j+1];//元素前移
                }
                b = true;
                size--;
                break;//找到删除并前移后退出
            }
        }
        if (!b){
            System.out.println("未找到该元素");
        }
    }

    /**
     *
     * @param index 删除该位置元素
     */
    public void remove(int index){
        if (isIndex(index)) {
            for (int i = index; i < getSize(); i++) {
                elementDate[i] = elementDate[i+1];//元素前移
            }
            size--;
        }else{
            System.out.println("该位置不存在元素，删除失败");
        }
    }

    /**
     *
     * @return 返回数组元素多少
     */
    public int getSize(){
        return size;
    }

    /**
     *
     * @param index 元素位置
     * @return 该位置存在元素返回true 否则返回false
     */
    private boolean isIndex(int index){//判断index是否在所存在元素之数内
        if (index >= size) {
            return false;
        }else{
            return  true;
        }
    }


}
