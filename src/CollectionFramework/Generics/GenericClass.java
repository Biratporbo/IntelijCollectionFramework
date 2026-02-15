package CollectionFramework.Generics;

class GenericContainer<T>{
    private T data;

    public GenericContainer(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }
}


public class GenericClass {
    public static void main(String[] args) {
     GenericContainer<Integer> intObj = new GenericContainer<>(5);
     System.out.println("Generic class returns: " + intObj.getData());

    GenericContainer<String> strObj = new GenericContainer<>("Java Generics");
    System.out.println("Generic class returns: " +  strObj.getData());

    }
}
