package Java8;

interface Greeter{
    void greet(String name);
}

public class FunctionallInterfaceCreate {
    public static void main(String[] args) {
        Greeter g = (String name) -> System.out.println("Hello " + name);
        g.greet("Birat");
    }
}
