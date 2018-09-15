import java.util.Scanner;

/**
 *
 */
public class Tutorial {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //تعريف السكانر المسؤول عن اخذ الانبوت من اليوزر
        System.out.println("Enter a number to check if palindrome or not: "); //سؤال اليوزر عن الرقم
        int n = scanner.nextInt();//اخذ الانبوت وتخزينه في فاريبل
        String tmp = Integer.toString(n);//تحويل الرقم الى سترنق
        String reverse = "";//فاريبل راح نخزن الرقم فيها بعد مانعكسه

        for(int i = tmp.length()-1;i>= 0;i--){//وظيفة اللوب هذي لعكس الرقم مثلا اذا الرقم كان ١٢٣ اللوب هذي راح تخليه ٣٢١ وتخزنه في reverse
            reverse += tmp.charAt(i);
        }

        boolean checkPalindrom = true;

        for(int i = 0;i<tmp.length();i++){//وظيفة اللوب هذي تقارن الرقم المعكوس بالرقم الاساسي اللي ادخله اليوزر، اذا متطامبقين يعني الرقم باليندروم

            if(reverse.charAt(i) != tmp.charAt(i)){
                checkPalindrom = false;
            }
        }
        System.out.println("is number palindrome? " + checkPalindrom); //طباعة الناتج لليوزر


    }
}
