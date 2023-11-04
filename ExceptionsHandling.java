import java.sql.SQLOutput;
import java.util.Scanner;

class MyException extends RuntimeException{
    public MyException(String string){
        super(string);
    }
}


public class ExceptionsHandling {

public void throwKeyword(){

    int i=11,k=0;
    try {
        k = 30 / i;
        if (i % 2 != 0) {
            throw new ArithmeticException("Not an int but Some decimal value");
        }
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    System.out.println("k= "+ k);
}

void throwYourOwnException(){

    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    try{
        if(!str.equals("Kamlesh")){
            throw new MyException("This is not my name");
        }
    }
    catch (MyException e){
        System.out.println(e);
    }
}



    public static void main(String[] args){

        ExceptionsHandling exceptionsHandling = new ExceptionsHandling();
        //exceptionsHandling.throwKeyword();
        exceptionsHandling.throwYourOwnException();

        try{
            int j=2;
            int k=20/j;

            String str="Kamal";
            System.out.println(str.length());

            int[] num = new int[]{1,2,3,4,5};
            System.out.println(num[0]);
            //System.out.println(num[10]);

            System.out.println(k);
        }
        catch (ArithmeticException e){
            System.out.println(e.getLocalizedMessage() + " A number can not be divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Be in your array limit");
        }
//        catch (Exception e){
//            System.out.println("Something went wrong");
//        }
    }
}
