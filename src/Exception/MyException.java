package Exception;
//User defined exception
//to throw whenever balance amount is below Rs. 1000

public class MyException extends Exception{

    //store account information
    private static int accno[] = {1001, 1002, 1003, 1004, 1005};
    private static String name[] = {"Raja Rao", "Babu Rao", "Appa Rao", "Laxmi Rao", "Rama Rao"};
    private static double bal[] = {10000.00, 12000.00, 5400.98, 9000.55, 14000.20};

    //default constructor
    MyException()
    {

    }
    //parameterized constructor
    MyException(String str)
    {
        super(str);
    }

    //write main()
    public static void main(String args[])
    {
        try{
            //display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER"+"\t"+ "BALANCE");

            //display actual account information
            for (int i=0; i<5; i++){
                System.out.println(accno[i]+"\t"+name[i]+"\t"+ bal[i]);

                //display own exception if balance < 1000
                if(bal[i]<1000)
                {
                    MyException me = new MyException("Balance amount is less");
                    throw me;
                }
            } //end of for
        }   //end of try
        catch (MyException me){
            me.printStackTrace();
        }
    }   //end of main
}   //end of MyException class
