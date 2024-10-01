public class class1ex {

    public String hello_comp(String B) {
        return B;
    }

    public String greet(String C) {
        return C;
    }

    public static void main(String[] args) {
        class1ex greeting = new class1ex();
        String x = greeting.greet("Hello Calvin");
        String y = greeting.greet("I am 21 years old");
        System.out.println(x);
        System.out.println(y);
    }
}
