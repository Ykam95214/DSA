import java.util.Scanner;
import java.util.Stack;

public class Mathematics {
    public int numberOfDigit(int num){
        int count = 0;
        if(num < 0)
            num = -num;

        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

    public boolean checkPalindrome(int num){
        int digitcount = 0,countOfDigit = numberOfDigit(num);
        Stack<Integer> stack = new Stack<>();

        int half = countOfDigit/2;
        while(num > 0){
            if(digitcount < half) {
                stack.push(num % 10);
            }
            else {
                if(digitcount == half && countOfDigit%2!=0) {
                    num/=10;
                    digitcount++;
                    continue;
                }
                if(num%10 != stack.pop()){
                    return false;
                }
            }
            digitcount++;
            num /= 10;
        }
        return true;
    }

    public int Factorial(int num){
        int fact=1;
        if(num < 0){
            System.out.println("Negative number");
            return -1;
        }
        else if(num == 0){
            return 1;
        }
        else {
            for(int i=1; i<=num; i++){
                fact*=i;
            }
            return fact;
        }
    }

    public static void main(String[] args){
        int num;
        Scanner scan = new Scanner(System.in);
        num=scan.nextInt();
        Mathematics math = new Mathematics();
        System.out.println("Number of digit in " + num + " = " + math.numberOfDigit(num));
        System.out.println("Number " + num + " is Palindrome = " + math.checkPalindrome(num));
        System.out.println("Factorial of " + num + " is = " + math.Factorial(num));
    }
}
