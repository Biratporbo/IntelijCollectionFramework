package Exception;
//Not handling the exception -using throws clause

import java.io.*;
class Sample{
    //instance variable
    private String name;
    //method to accept name
    void accept() throws IOException
    {
        //to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        name = br.readLine();
    }
    //method to display
    void display(){
        System.out.println("Name: " + name);
    }
}
public class Ex1 {
    public static void main(String[] args) throws IOException {
        Sample s = new Sample();
        s.accept();
        s.display();
    }
}
