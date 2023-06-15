public class two {
    public static void main(String[] args) {
        //Даны 2 строки
        String s = "select * from students where ";
        String jsonFilter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

//строку s добавляем в стринг билдер
StringBuilder sb = new StringBuilder(s);

//затем нужно избавиться от всех лишних элеменотов формата json

jsonFilter = jsonFilter
                .replace("{","")
                .replace("}","")
                .replace("\"","");

//затем сделать из строки массив строк используя split
String[] jsonFilterArray = jsonFilter.split(", ");
//получится:
[name:Ivanov, country:Russia, city:Moscow, age:null]

//затем пробегаемся по массиву
//еще раз делаем .split(":") кадого элемента на имя колонки и значение
//и затем добавяем это в строку s
sb.append(columnValueArray[0]).append(" = '").append(columnValueArray[1]).append("' and ");

//+ нужно добавить проверку на null (в этом случае ничего не делаем)

    }
}
