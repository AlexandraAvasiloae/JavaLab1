package Compulsory;

public class FirstJava {

    /*generate a random integer n*/
    public static int random(){
        int n = (int) (Math.random() * 1_000_000);
        return n;
    }

    /*the result obtained after performing the calculations*/
    public static int compute(int n) {

        /* multiply n by 3*/
        n=n*3;

        /*add the binary number 10101 to the result*/
        n=n+Integer.parseInt("10101",2);

        /*add the hexadecimal number FF to the result*/
        n=n+Integer.parseInt("FF",16);

        /*multiply the result by 6*/
        n=n*6;

        return n;
    }
    public static int  sumOfDigits(int n){
        /*
          Compute the sum of the digits in the result obtained in the previous step.
          This is the new result.
          While the new result has more than one digit, continue to sum the digits of the result.
          */
        int result=0;
        while(result==0 || result>9) {
            result=0;
            while (n != 0) {
                result = result + n % 10;
                n = n / 10;
            }
            n=result;
        }
        return result;
    }
    public static void main (String args[]){
        /*Display on the screen the message "Hello World!"*/
        System.out.println("Hello world!");

        /*Define an array of strings languages*/
        String languages [] ={"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        /*display on the screen the array of strings languages*/
        int i;
        for(i=0;i<=9;i++){
        System.out.println(languages[i]);}

        /*Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].*/
        System.out.println("Willy-nilly, this semester I will learn " + languages[sumOfDigits(compute(random()))]);
   }
}
