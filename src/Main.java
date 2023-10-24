public class Main {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        System.out.println(a.compareTo(b));


        Integer x = 30;
        Integer y = 30;
        System.out.println(x.compareTo(y));


        Integer w = 15;
        Integer z = 8;
        System.out.println(w.compareTo(z));
        System.out.println();


        Integer num1 = 10;
        Integer num2 = 5;
        Integer num3 = 10;
        int result1 = num1.compareTo(num2);
        int result2 = num1.compareTo(num3);
        int result3 = num2.compareTo(num3);
        System.out.println("Comparing num1 and num2: "
                + result1);
        System.out.println("Comparing num1 and num3: "
                + result2);
        System.out.println("Comparing num2 and num3: "
                + result3);
    }
}