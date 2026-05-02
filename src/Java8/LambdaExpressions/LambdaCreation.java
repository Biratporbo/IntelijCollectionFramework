package Java8.LambdaExpressions;

interface HelloWorld{
    String sayHello(String name);
}

public class LambdaCreation {
    public static void main(String[] args) {
        HelloWorld helloworld = (String name) -> {return "Hello " + name; };
        System.out.println(helloworld.sayHello("Birat"));
    }
}
