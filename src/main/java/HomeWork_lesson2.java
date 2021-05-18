public class HomeWork_lesson2 {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 15));
        System.out.println(isPositiveOrNegative(-1));
        System.out.println(isNegative(5));
        printWordNTimes("Hello",6);
    }

    static boolean within10and20(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String isPositiveOrNegative(int c) {
        if (c >= 0) {
            return ("Число положительное");
        } else {
            return ("Число отрицательное");
        }
    }
    public static boolean isNegative(int d){
        if (d <= 0 ) {
            return true;
        }
        return false;

    }
    public static void printWordNTimes(String work,int times) {
        for (int i = 1; i < times; i++) {
            System.out.println("Hello");
        }
    }

}
