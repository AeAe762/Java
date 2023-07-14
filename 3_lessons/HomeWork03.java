import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//Пусть дан произвольный список целых чисел.
public class HomeWork03 {

  // Нужно удалить из него четные числа
  public static List<Integer> RemoveNum(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 0)
        list.remove(i);
    }
    return list;
  }

  // Найти минимальное значение
  public static Integer MinNum(List<Integer> list) {
    int minNum = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) < minNum)
        minNum = list.get(i);
    }
    return minNum;
  }

  // Найти максимальное значение
  public static Integer MaxNum(List<Integer> list) {
    int maxNum = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) > maxNum)
        maxNum = list.get(i);
    }
    return maxNum;
  }

  // Найти среднее значение
  public static Integer Srednee(List<Integer> list) {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    return sum / list.size();
  }

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 23, 66, 45, 16, 3, 2, 19, 24, 40));
    System.out.println(list1);
    System.out.println("Удаляю четные числа: ");
    System.out.println(RemoveNum(list1));
    System.out.println("Минимально значение: ");
    System.out.println(MinNum(list1));
    System.out.println("Максимальное значение");
    System.out.println(MaxNum(list1));
    System.out.println("Среднее значение: ");
    System.out.println(Srednee(list1));
  }

}
