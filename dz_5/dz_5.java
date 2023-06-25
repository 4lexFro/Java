/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными 
телефонами, их необходимо считать, как одного человека с разными телефонами. 
Вывод должен быть отсортирован по убыванию числа телефонов.*/

package dz_5;

import java.util.HashMap;

public class dz_5 {
    
    public static void main(final String[] args) {
        var dict = new HashMap<String, String>();
        dict.put("592075", "Виктор Гюго");
        dict.put("932674", "Боло Янг");
        dict.put("349012", "Боло Янг");
        dict.put("987632", "Сергей Безруков");
        dict.put("765744", "Светлана Сорокина");
        dict.put("123456", "Светлана Сорокина");
        dict.put("927543", "Ирина Отиева");
        dict.put("885143", "Ирина Отиева");
        dict.put("784366", "Ирина Отиева");
        dict.put("883366", "Александр Петров");

        var a = get(dict);

        a.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }


    public static HashMap<String, Integer> get(HashMap<String, String> dict){
        var result = new HashMap<String, Integer>();
        for (var item : dict.entrySet()) {
            if (result.containsKey(item.getValue())) {
                var key = item.getValue();
                var value = result.get(item.getValue());
                result.replace(key, value + 1);
            } else {
                result.put(item.getValue(), 1);
            }
        }
        return result;
    }
}

    

