
//public class program {
//public static void main(String[] args) {
// System.out.println("By");
//String s; // Объявление пременной;
// s = "asdf"; // Инициализация переменной;
//String s = "3"; // Объявление и инициализация переменной;
//System.out.println(s);    
//}

//}
// java program.java - команда для вывода результата через консоль

// Ввод данных с клавиатур
/* Текст */

/* import java.util.Scanner;

public class program {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("name: ");
    String name = iScanner.nextLine();
    System.out.printf("Привет, %s!", name);
    iScanner.close();
  }
}
 */

/* Примитивные значение (int, float и тд.) */

/* import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: "); // Указывает тип перемонной которую будем вводить
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble () ;
        System.out.printf ("%d + %f = %f", x, y, x + y) ;
        iScanner.close () ;
}} */

/* Проверка на соответствие получаемого типа */
/* import java.util.Scanner;

public class program {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("int a: ");
    boolean flag = iScanner.hasNextInt(); // проверяет действительно ли введен нужный тип данных, если нет выдает false
    System.out.println(flag);
    int i = iScanner.nextInt();
    System.out.println(i);
    iScanner.close();
  }
} */

/* Форматированный вывод */
/* public class program {
  public static void main (String[] args) {
    int a = 1, b = 2;
    int c = a + b;
    String res = a + " + " + b + " = " + c;
    System.out.println(res);
}} */

/* Форматированный вывод */
/* public class program {
  public static void main(String[] args) {
    int a = 1, b = 2;
    int c = a + b;
    String res = String.format("%d + %d = %d \n", a, b, c); // %d + %d = %d форма по которой будет выводиться, 
        // a, b, c - указываются переменный в той последовательности в которой они должны быть использованы в форме
    // System.out.printf("%d + %d = %d \n", a, b, c); // если сразу выводить то можно так без строки 74
    System.out.println(res); // используется вместе со стракой 74 через функцию format;
  }
} */

/*                                                        Виды спецификаторов
%d: целочисленных значений 
%×: для вывода шестнадцатеричных чисел 
%f: для вывода чисел с плавающей точкой 
%e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
%с: для вывода одиночного символа
%5: для вывода строковых значений 
*/

/* Вывод количества знаков после запятой */
/* public class program {
  public static void main(String[] args) {
    float pi = 3.1415f; // Обязательно при использованни типа данны float после введенного числа
                        // необходимо ставить букву f
    System.out.printf("%f \n", pi); // 3,141500
    System.out.printf("%.2f \n", pi); // 3,14 выведет 2 знака после запятой
    System.out.printf("%.3f \n", pi); // 3,141 выведет 3 знака после запятой
    System.out.printf("%e \n", pi); // 3,141500e+00 выведет число в экспоненциальной форме
    System.out.printf("%.2e \n", pi); // 3,14e+00 выведет число в экспоненциальной форме с 2 знаками после запятой
    System.out.printf("%.3e \n", pi); // 3,141e+00 выведет число в экспоненциальной форме с 3 знаками после запятой
  }
} */

/*
 * Область видимости переменных
 * 
 * 
 * У переменных существует понятие «область видимости».
 * Если переменную объявили внутри некоторого блока фигурных скобок { }, то
 * снаружи этого блока переменная будет недоступна.
 * public class Program {
 * public static void main(String[] args) {
 * {
 * int i = 123;
 * System.out.println(i);
 * }
 * System.out.println(i); // error: cannot find symbol
 * }
 * }
 */

// Функции и методы

/* public class program {
  static void sayHi () { // Функция, которая будет выводить hi
    System.out.println("hi!");
  }
  static int sum(int a, int b) { // еще 1 функция, которая будет считать сумму a и b
    return a+b;
  }

  static double factor(int n) { // рекурсия, которая считает факториал числа n
    if (n == 1) // Условие при котором рекурсия прекращает работать
      return 1;
    return n * factor(n - 1);
  }

  public static void main(String[] args) {
    sayHi(); // hi!  вызываем функцию 
    System.out.println(sum(1, 3)); // 4
    System.out.println(factor(5)); // 120.0
  }
} */

/* Управляющие конструкции: условный оператор 
 *              if, else*/

/* public class program {
    public static void main(String[] args) {
        int a = 4;  
        int b = 2;
        int c;
        if (a > b) { // или можно записать так: if (a>b) c = a;
          c = a; } 
        else { // Вместо else прописать if (b > a) c = b;
          c = b; }
        System.out.println(c);
    }
 }
  */

/* тернарный оператор */
/* public class program {
    public static void main(String[] args) {
      int a = 3;
      int b = 2;
      int min = a < b ? a : b; // Если условие верно значит вернется переменная, которая стоит после знака "?"  и до знака ":"
                              // если условие не верно, значит вернется переменная после знака ":"
      System.out.println(min);
} } */

/* Оператор выбора  (switch) */
/* import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        int mounth = value;
        String text = " ";
        switch (mounth) {
          case 1: // указывает что будет происходить если введут 1
          text = "Autumn";
          break;

        default: // не обязательное значение
          text = "mistake";
          break;
        }
        System.out.println(text);
        iScanner.close();
      }
} */

/* Цикл while */
/* public class program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
           value /= 10;
           count++; 
         }
        System.out.println(count);
    }
} */

/* Цикл do while */
/*  public class program {
     public static void main(String[] args) {
      int value = 321;
      int count = 0;
      do {
        value /= 10;
        count++;
      } while (value != 0);
      System.out.println(count);
     }
    } */

/* Оператор цикла for  */
/* public class program {
  public static void main(String[] args) {
    int s = 0;
    for (int i = 1; i <= 10; i++) {
      s += i; 
    }
    System.out.println(s);
  }
} */

/* Вложенные циклы */
/*  public class program {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("* ");
      }
    System.out.println();
    }
  }
 } */

/* Работает только для коллекций */
/*  public class program {
  public static void main(String[] args) {
    int arr[] = new int[] {1,2,3,4,5,6,7};
    for (int item : arr) {
      System.out.printf("%d ", item);
    }
    System.out.println();
  }
} */

/* Работа с файлами
Создание и запись\ дозапись */
/* import java.io.FileWriter;
import java.io.IOException;
public class program {
 public static void main(String[] args) {
   try (FileWriter fw = new FileWriter("file.txt", false)) { // Предназнаачен для обработки ошибок, file.txt - имя файла
     fw.write("line 1"); // fw - file writer
     fw.append('\n');
     fw.append('2');
     fw.append('\n');
     fw.write("line 3");
     fw.flush();
   } catch (IOException ex) {
       System.out.println(ex.getMessage());
} }} */

/* Чтение, Вариант посимвольно */
/* import java.io.*;
public class program {
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("file.txt");
    int c;
    while ((c = fr.read()) != -1) {
      char ch = (char) c;
      if (ch == '\n') {
        System.out.print(ch);
      } 
      else {
        System.out.print(ch);
      }
    } 
  }
} */

/* Вариант построчно */
/* import java.io.*;

public class program {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    String str;
    while ((str = br.readLine()) != null) {
      System.out.printf("== %s ==\n", str);
    }
    br.close();
  }
} */

