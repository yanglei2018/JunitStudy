package Demo01;

public class calculatorTest {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int a = cal.add(1,1);
        int b = cal.sub(3, 2);

        System.out.println(a);
        System.out.println(b);
    }
}
