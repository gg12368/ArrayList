数值添加到集合：生成6个1~33之间的随机整数,添加到集合,并遍历

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        // 创建Random 对象
        Random random = new Random();
        // 创建ArrayList 对象
        ArrayList<Integer> list = new ArrayList<>();
        // 添加随机数到集合
        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(33) + 1;
            list.add(r);
        }
        // 遍历集合输出
         for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
