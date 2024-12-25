import java.util.AbstractList;
import java.util.Scanner;
public class voldgam {

    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
        boolean codeactive = true;
        while (codeactive) {
          System.out.print("\nНомер задания (6, 7, 8, 19, 20, 21, 22): ");
          int numberqyest = scanner.nextInt();
          switch (numberqyest) {
            case 0:
              ExitProgram();
            case 6:
              arrayrecalculation();
              break;
            case 7:
              arraymax();
              break;
            case 8:
              fix();
              break;
            case 19:
              interfacemethod();
              break;
            case 20:
              runjumpint();
              break;
            case 21:
              Listsize();
              break;
            case 22:
              fix2();
              break;
            default:
              System.out.println("Некорректный номер задания.");
              break;
          }
        }
      }

    }
    
    //interfaces
    interface MyInterface {
      void myMethod();
    }

    interface Runner {
      void run();
    }
   
   interface Jumper {
     void jump();
    }

    private static void ExitProgram(){
      System.out.println("\n Выход из программы \n");
      System.exit(0);
    }
    //

    //#6
    private static void arrayrecalculation() {
      System.out.println("Задание №6");
      System.out.println("Реализуйте метод, который находит сумму всех элементов массива, используя цикл for");
      System.out.println("Массив = 1, 2, 3, 4, 5");
      int[] numbers = {1, 2, 3, 4, 5};
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
          sum += numbers[i];
      }
      System.out.println("Сумма элементов массива: " + sum); 
  }
  //#6 Конец


  //#7
  private static void arraymax(){
    System.out.println("Задание №7");
    System.out.println("Напишите метод, который возвращает наибольшее значение  в массиве, используя цикл for-each");
    System.out.println("Массив = 1, 3, 5, 7, 9");
    int[] numbers = {1, 3, 5, 7, 9};
    int max = numbers[0];
    for (int num : numbers) {
      if (num > max) {
      max = num;
      }
    }
     System.out.println("Максимальное значение в массиве: " + max);
  }
  //#7 конец


  //#8
  private static void fix(){
    System.out.println("Задание №8");
    System.out.println("Исправьте код для корректной работы:");
    for (int i = 0; i < 10; i++) {
        if (i == 5){
          continue; //break заменился на continue
        }
        System.out.print(i );// Вывод будет все числа от 1 до 9 без учёта 5, но с break при i равном 5 код обрывался, благодаря continue код просто скипает значение 5 и продолжает спокойно свою работу
    }
    System.out.println();
  }
  //#8 конец


  //#19
  private static void interfacemethod(){
    System.out.println("Задание №19");
    System.out.println("Напишите метод, который принимает объект интерфейса и вызывает его метод");
    
    MyInterface myObject = new MyInterface(){
      @Override
      public void myMethod(){
        System.out.println("Метод работает");
      }};
    callInterfaceMethod(myObject);
    }
    private static void callInterfaceMethod(MyInterface obj) {
      obj.myMethod();
  }
  //#19 конец



  //#20
  private static void runjumpint(){
    System.out.println("Задание №20");
    System.out.println("Реализуйте два интерфейса в одном классе. Один интерфейс должен содержать метод `run()`, другой - `jump()`");
    class man implements Runner, Jumper {
      @Override
      public void run() {
        System.out.println("Мужик побежал");
     }
      @Override
      public void jump() {
        System.out.println("Мужик попрыгал");
     }
  }
    man sportMan = new man();
    sportMan.run();
    sportMan.jump();
  }
  //#20 конец

  //#21
  private static void Listsize(){
    System.out.println("Задание №21");
    System.out.println("Напишите класс, который наследует интерфейс `List` и реализует только метод `size()`");
    AbstractList<Integer> myList = new AbstractList<Integer>() {
          @Override
            public Integer get(int index) {
                throw new UnsupportedOperationException();
            }
          @Override
            public int size() {
              return 52; 
            }
      };
    System.out.println("Размер списка: " + myList.size());
  }
  //#21 конец

    //#22
  private static void fix2(){
    System.out.println("Задание №22");
    System.out.println("Исправьте ошибку в коде:");
    interface A{
      void display();// Ошибка была в том, что был static внутри интерфейса, с java 8 интерфейсы получили возможность иметь static методы.
    }
  }
}