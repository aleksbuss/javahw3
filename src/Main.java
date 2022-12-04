import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a = scanner.nextInt();
        System.out.println(a);


        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(sum(b,c,d));
        System.out.println(minus(c,d));

    }
        public static int sum(int s,int r,int x) {
            return s+r+x;
        }
        public static int minus(int r,int x) {
                return r-x;


        }
}



//
//
//        //2



//
//        int n1 = 3, n2 = 5, sum;
//        int n3 = 7;
//        sum = n1 + n2 + n3;
//        System.out.println("The sum of numbers is: " + sum);
//
//        int[] myArray = {5, 7, 9};
//        int sum1 = 0;
//        for (int j : myArray) {
//            sum1 = sum1 + j;
//        }
//        System.out.println("The sum from second method: " + sum1);
//
//        //3*
//        double c1 = 14.6, c2 = 14.4, sub;
//        sub = c1 - c2;
//        System.out.println("Sub printing out: " + sub); // do not count money this way :))))






//        // Scanner -- класс для считывания значений из консоли
//        static Scanner scanner = new Scanner(System.in);  // 1. Сделать глобальную переменную static Scanner
//
//        public static void main(String[] args) {
//            int a = scanner.nextInt();  // 2. считать два значения в методе main
//            int b = scanner.nextInt();  // 2. считать два значения в методе main
//
//            // 5. вернуть в main
//            int d = calculateDiff(a, b); // 3. передать их в функцию
//
//            // 6. вывести на консоль из метода main
//            System.out.println(d);

        //cosultation


//    }
////TODO
//    // 1. Создать глобальную переменную Scanner (так же как в дз)
//    // 2. Считать 3 значения из консоли в методе main
//    // 3. Передать эти 3 значения в метод findMin(int a, int b, int c)
//    // 4. Найти меньшее значение из 3
//    // 5. Вернуть это значение
//    // 6. В методе main вывести полученное значение в консоль
//
//    static Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    int c = scanner.nextInt();
//
//    static int findMin ( int a, int b, int c){
//        if (a <= b && a <= c) {
//            return a;
//        } else if (b <= c && b < a) {
//            return b;
//        } else {
//            return c;
//        }
//    }
//    static int findMin2 ( int a, int b, int c){
//        return Math.min(Math.min(a, b), Math.min(b, c));
//






//            Scanner scan = new Scanner(System.in);
//            System.out.println("Введите 3 вещественных числа:");
//            float a = scan.nextFloat();
//            float b = scan.nextFloat();
//            float c = scan.nextFloat();
//
//            a = Math.abs(a);
//            b = Math.abs(b);
//            c = Math.abs(c);
//            System.out.println(a + " "+ b+ " "+c);
//
//            float tmp = Math.min(a,b);
//            float min = Math.min(tmp, c);
//            System.out.println("Наименьшее вещественное число по модулю:\n" + min);
//        }
//    }


//


//    Car car = new Car(2000, 220, "VW", (short)12);
//    car.printOut();
//    System.out.println(car.print());
//
//    String str = car.print();
//    str = str + " fjhd skjfds hk";
//        System.out.println(str);
//
//    int a;


//    System.out.println(" insert you name: " );
//    a = scanner.nextInt();
//
//    System.out.println("get out int: " + a);
//
//
//
//    double data;
//
//        data = scanner.nextInt();
//        System.out.println("get out double: " + data);
//
//    char c;
//    char c1;
//        System.out.println("insert type char: ");
//        c = scanner.next().charAt(0);
//        c1 = scanner.next().charAt(1);
//        System.out.println("insert: " + c);
//        System.out.println("insert: " + c1);
//
//
//
//        String str1 = " ";
//        System.out.println("Insert string: " + str1);
//        str1 = scanner.next();
//        System.out.println(str1);
//
//        String str2 = " ";
//        System.out.println("string: " + str2);
//        str2 = scanner.nextLine();
//        System.out.println("next string: " + str2);

//        System.out.println("hi, group 43-44 \n my name is Alex");
////        printInt();
//        System.out.println(sum());
//
//
//    }
//    static void printInt(){
//        System.out.println("get out: ");
//        int a = scanner.nextInt();
//        System.out.println("getting out: " + a);
//    }
//    public static int sum(){
//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//        return a+b;
//    }
//

