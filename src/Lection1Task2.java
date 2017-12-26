public class Lection1Task2 {


    private static String line1 = "We make work HUMAN.";
    private static String line2 = "Unlock full potential." + "Celebrate positive moments.";
    private static String line3 = "Every day.";
    public static final String SEPARATOR = "\n";


    private static void method_A() {
        System.out.println("task 2a)");
        String str = new String(line1 + SEPARATOR + line2 + SEPARATOR + line3);
        System.out.println(str);
    }

    private static void method_B() {
        System.out.println("task 2b)");
        String str = new String(line2);
        System.out.println(str.length());
    }

    private static void method_C() {
        System.out.println("task 2c)");
        String str = new String(line1 + SEPARATOR + line2 + SEPARATOR + line3);
        System.out.println(str.toLowerCase());
    }

    private static void method_D() {
        System.out.println("task 2d)");
        String str = new String(line1 + SEPARATOR + line2 + SEPARATOR + line3);
        System.out.println(str.replace('e', 'E'));
    }


    public static void main(String args[]) {
        method_A();
        method_B();
        method_C();
        method_D();

    }
}
