package dz_6;

/* Разработать программу, имитирующую поведение коллекции HashSet. В программе 
содать метод add добавляющий элемент, метод toString возвращающий строку с 
элементами множества и метод позволяющий читать элементы по индексу.
*Реализовать все методы из семинара.
Формат данных Integer. */

import java.util.HashMap;
public class dz_6 {
    private static HashMap <Integer, Object> hashMap = new HashMap<>();
    private static final Object PRESENT  = new Object();
    public static void main(String[] args) throws Exception {
        add(23);
        add(67);
        add(2);
        add(82);
        add(16);
        System.out.println(getString());

        System.out.println(gettkey(1));
        System.out.println(gettkey(4));
    }

    private static int gettkey(int num) {
        return (Integer)hashMap.keySet().toArray()[num];
    }

    private static String getString(){
        return hashMap.keySet().toString();
    }

    public static void add(Integer numbers) {
        hashMap.put(numbers, PRESENT);
    }            
}  