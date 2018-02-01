package seleniumtest;

import java.util.ArrayList;
import java.util.List;
public class Listtest {
    public static void main(String[] args) {
        System.out.println("开始：");
        String a = "A", b = "B", c = "C", d = "D", e = "E";
        List<String> list = new ArrayList<String>();
        list.add(a); // 索引位置为 0
        list.add(b); // 索引位置为 1
        list.add(c); // 索引位置为 2
        list.add(d); // 索引位置为 3
        list.add(e); // 索引位置为 4
        list = list.subList(1, 3);// 利用从索引位置 1 到 3 的对象重新生成一个List集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("结束！");
    }
}
