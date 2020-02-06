对象添加到集合：自定义4个学生对象，添加到集合，并遍历


第一部分代码：自定义4个学生对象

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

第二部分代码：添加到集合，并遍历
import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公", 20);
        Student two = new Student("欧阳锋", 21);
        Student three = new Student("黄药师", 22);
        Student four = new Student("段智兴", 23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄" + stu.getAge());
        }
    }
}
