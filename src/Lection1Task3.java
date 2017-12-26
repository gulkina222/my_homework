public class Lection1Task3 {

    static char[] globoArray = {'G', 'l', 'o', 'b', 'o', 'f', 'o', 'r', 'c', 'e'};

    private static void method_A() {
        System.out.println("task 3a)");
        System.out.println(globoArray);
    }

    private static void method_B() {
        System.out.println("task 3b)");
        System.out.println(globoArray.length);
    }

    private static void method_C() {
        System.out.println("task 3c)");
        for (int i = 0; i < globoArray.length; i++) {
            if (globoArray[i] == 'b') {
                globoArray[i] = '$';
            }
        }
        System.out.println(globoArray);
    }

    public static void main(String args[]) {
        method_A();
        method_B();
        method_C();
    }
}
