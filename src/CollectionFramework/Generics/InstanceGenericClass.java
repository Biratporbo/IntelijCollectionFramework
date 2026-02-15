package CollectionFramework.Generics;

//Generic Basic Syntax
class Box<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}

public class InstanceGenericClass {
    public static void main(String[] args) {
        Box<Integer> intbox = new Box<>();
        intbox.setValue(100);
        System.out.println("Number count: " + intbox.getValue());

        Box<String> strbox = new Box<>();
        strbox.setValue("Hello Generics");
        System.out.println("Generics return: " + strbox.getValue());
    }
}
