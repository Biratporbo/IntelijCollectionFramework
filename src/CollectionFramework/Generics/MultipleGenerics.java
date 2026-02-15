package CollectionFramework.Generics;

class GenericsConatiner<T, V>{

    private T key;
    private V value;

    public GenericsConatiner(T key, V value){
        this.key = key;
        this.value = value;
    }

    public T getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}

public class MultipleGenerics {
    public static void main(String[] args) {
        GenericsConatiner<String, Integer> conatainer1 = new GenericsConatiner<>("Birat", 22);
        GenericsConatiner<String, Integer> conatainer2 = new GenericsConatiner<>("Soma", 40);

        System.out.println("Key name: " + conatainer1.getKey() + "\nValue age: " + conatainer1.getValue());
        System.out.println("Key name: " + conatainer2.getKey() + "\nValue age: " + conatainer2.getValue());


    }
}
