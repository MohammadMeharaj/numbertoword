import java.util.Scanner;
public class NumberToWords {

    private static String NumberToWords (int a){
        String word=" ";
        String unitarray[]={"zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tensarray= {"zero", "ten", "Twenty", "Thirty", "Forty","Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if (a == 0) {
            return "Zero";
        }
        if (a < 0) {
            String number =" "+a;
            number=number.substring(1);
            return "Negative " + NumberToWords(Integer.parseInt(number));
        }

        String result = "";
        if ((a / 10000) > 0) {
            result +=NumberToWords(a / 10000) + " Lakh ";
            a %= 10000;
        }
        if ((a / 1000) > 0) {
            result +=NumberToWords(a / 1000) + " Thousand ";
            a %= 1000;
        }
        if ((a / 100) > 0) {
            result += NumberToWords(a / 100) + " Hundred ";
            a %= 100;
        }
        if (a > 0) {
            if (a < 20) {
                result += unitarray[a];
                }
            else
            {
                result+=tensarray[a/10];
                if (a % 10 > 0) {
                    result += " " + unitarray[a % 10];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number==0)
        {
            System.out.println("Noinput");
        }
        else
        {
            System.out.println("Number in words:"+ NumberToWords (number));
        }
       
    }
}

