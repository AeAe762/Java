/* import java.util.ArrayList;
import java.util.List; */

/* public class lecture {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer> (); // Создал коллекцию; <Integer> - указывает тип данных коллекции
    list.add(2809); // добавил в коллекцию переменную
    //list.add("string line");
    for (Object o : list) {
      System.out.println(o);
    }


// Проблема извлечения данных
  }
} */

                                                          /* «Удобный массив» 
                                                          Разные способы создания
ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>(10);
ArrayList<Integer> list4 = new ArrayList<>(list3); */

/* public class lecture{
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(12);
    System.out.println("list1");
    System.out.println(list1);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(15);
    System.out.println("list2");
    System.out.println(list2);
    ArrayList<Integer> list3 = new ArrayList<>(10);
    list3.add(1);
    System.out.println("list3");
    System.out.println(list3);
    ArrayList<Integer> list4 = new ArrayList<>();
    System.out.println("list4");
    System.out.println(list4);
  }
}

 */

 /*                               Коллекции. Функционал
add(args) – добавляет элемент в список ( в т.ч. на нужную позицию) 
get(pos) – возвращает элемент из списка по указанной позиции indexOf(item) – первое вхождение или -1
lastIndexOf(item) – последнее вхождение или -1
remove(pos) – удаление элемента на указанной позиции и его возвращение
void sort(Comparator) – сортирует набор данных по правилу
subList(int start, int end) – получение набора данных от позиции start до end */


/* public class lecture {

  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(11, 9, 45, 6, 74, 23, 15, 70, 85, 20));
    System.out.println("list1");
    System.out.println(list1);
    System.out.println("list1.subList(0, 3);");
    System.out.println(list1.subList(0, 3));
  }
} */

/* import java.util.Arrays;
import java.util.List;
public class lecture {
  public static void main(String[] args) {
  int day = 29;
  int month = 9;
  int year = 1990;
  Integer[] date = {1, 23, 45 };
  List<Integer> d = Arrays.asList(date);
  System.out.println(d); // [29, 9, 1990]
  }
} */

/* Коллекции. Функционал
clear() – очистка списка
toString() – «конвертация» списка в строку
Arrays.asList – преобразует массив в список
containsAll(col) – проверяет включение всех элементов из col 
removeAll(col) – удаляет элементы, имеющиеся в col
retainAll(col) – оставляет элементы, имеющиеся в col
toArray() – конвертация списка в массив Object’ов
toArray(type array) – конвертация списка в массив type 
List.copyOf(col) – возвращает копию списка на основе имеющегося 
List.of(item1, item2,...) – возвращает неизменяемый список */