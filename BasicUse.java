import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        //创建学生数组
        ArrayList<String> list = new ArrayList<>();
        // 创建学生对象
        String s1 = "曹操";
        String s2 = "刘备";
        String s3 = "孙权";
        // 打印学生ArrayList集合
        System.out.println(list);
        // 把学生对象作为元素添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //打印学生ArrayList集合
        System.out.println(list);
        }
}
