package com.collection.test;

import java.util.*;

public class CollectionTest {
    public static void collection() {
        // 创建集合c
        Collection c = new ArrayList();
        // 向集合中添加元素
        c.add("Apple");
        c.add("Banana");
        System.out.println("集合c中的元素个数: " + c.size());

        ArrayList array = new ArrayList();
        array.add("Cat");
        array.add("Dog");
        // 如果array集合不为空
        if (!array.isEmpty()) {
            // 将array中的元素添加到c中
            c.addAll(array);
        }
        System.out.println("集合c中的元素个数: " + c.size());

        // 返回迭代器iterator
        Iterator iterator = c.iterator();
        System.out.print("集合c中的元素: ");
        // 判断迭代器中是否存在下一元素
        while (iterator.hasNext()) {
            // 使用迭代器循环输出集合中的元素
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        if (c.contains("Cat")) {
            System.out.println("---集合c中包含元素Cat---");
        }
        // 从c中删除array中的所有元素
        c.removeAll(array);
        System.out.println("C:" + c.toString());
        // 将集合中的元素存放到字符串数组中
        Object[] str = c.toArray();
        String s = "";
        System.out.print("数组中的元素: ");
        for (int i=0; i < str.length; i++) {
            // 将对象强制转换为字符串类型
            s = (String)str[i];
            System.out.print(str[i] + " ");
        }
    }
    public static void arrayTest() {
        ArrayList list = new ArrayList();
        list.add("cat");
        list.add("dog");
        list.add("pig");
        list.add("pig");
        System.out.println("---输出集合中的元素---");
        System.out.println("写法一: ");
        // 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 写法二
        System.out.println("写法二: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.toArray()[i]);
        }

        // 替换指定索引处的元素
        System.out.println("返回替换集合中索引是1的元素：" + list.set(1, "mouse"));
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 获取指定索引处的集合元素
        System.out.println("获取索引是2的元素：" + list.get(2));
        System.out.println("集合中第一次出现pig元素的索引：" + list.indexOf("pig"));
        System.out.println("集合中最后一次出现pig元素的索引：" + list.lastIndexOf("pig"));

        // 创建新集合
        List l = list.subList(1, 4);
        iterator = l.iterator();
        System.out.println("---新集合中的元素---");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
    public static void linkedListTest() {
        // 创建初始容量为10的空列表
        LinkedList list = new LinkedList();
        list.add("cat");
        list.add("dog");
        list.add("pig");
        list.add("sheep");
        System.out.println("元素：");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        list.addLast("mouse");
        list.addFirst("duck");
        System.out.println("元素：");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("获取集合的第一个元素：" + list.getFirst());
        System.out.println("获取集合的最后一个元素：" + list.getLast());
        System.out.println("删除集合的第一个元素：" + list.removeFirst());
        System.out.println("删除集合的最后一个元素：" + list.removeLast());
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void hashSetTest() {
        // HashSet元素不能重复
        HashSet hash = new HashSet();
        hash.add("56");
        hash.add("32");
        hash.add("48");
        hash.add("48");
        hash.add("23");
        System.out.println("集合元素个数：" + hash.size());
        Iterator iterator = hash.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void treeSetTest() {
        // HashSet元素不能重复
        TreeSet tree = new TreeSet();
        tree.add("45");
        tree.add("32");
        tree.add("68");
        tree.add("12");
        tree.add("20");
        tree.add("80");
        tree.add("75");
        System.out.println("集合元素个数：" + tree.size());
        Iterator iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("集合中20~68的元素：");
        SortedSet s = tree.subSet("20", "68");
        Iterator iterator1 = s.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("集合中45之前的元素：");
        // 包括45
        SortedSet s1 = tree.headSet("45");
        Iterator iterator2 = s1.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("集合中45之后的元素：");
        // 不包括45
        SortedSet s2 = tree.tailSet("45");
        Iterator iterator3 = s2.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        System.out.println("集合中第一个元素：" + tree.first());
        System.out.println("集合中最后一个元素：" + tree.last());
        System.out.println("删除集合中第一个元素：" + tree.pollFirst());
        System.out.println("删除集合中第一个元素：" + tree.pollLast());
        System.out.println("集合中的元素：");
        iterator = tree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void hashMapTest() {
        HashMap map = new HashMap();
        // 添加键值对
        map.put("101", "一代天骄");
        map.put("102", "成吉思汗");
        map.put("103", "只识弯弓射大雕");
        map.put("104", "俱往矣");
        // 重复键的HashMap，会添加最后一个值
        map.put("105", "数风流人物");
        map.put("105", "还看今朝");
        map.put("100", "念奴娇");
        System.out.println("指定键102获取值：" + map.get("102"));
        // 获得HashMap键的集合
        Set s = map.keySet();
        Iterator iterator = s.iterator();
        String key = "";
        while (iterator.hasNext()) {
            key = (String)iterator.next();
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static void hashMapTest2() {
        HashMap<String, String> map = new HashMap<>();
        map.put("123", "123");
        map.put("sfsa", "123bdf");
        System.out.println(map);
        System.out.println(map.get("123"));
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----");
        for (String i: map.keySet()) {
            System.out.println(i);
            System.out.println(map.get(i));
        }
        System.out.println("---------");
        Set set = map.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    public static void main(String[] args) {
//        collection();
//        arrayTest();
//        linkedListTest();
//        hashSetTest();
//        treeSetTest();
//        hashMapTest();
        hashMapTest2();
    }
}
