import java.util.Scanner;
public class Artikyil {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if(year % 400 == 0) {
            System.out.println(year +" bir artık yıldır.");
        } else if ((year % 4 == 0) && (year % 100 > 0)) {
            System.out.println(year +" bir artık yıldır.");
        }else {
            System.out.println(year + " bir artık yıl değildir.");
        }


        /*
        boolean leap = (year % 100 == 0 ? (year % 400 == 0) : year % 4 == 0);
        if(leap){
            System.out.println(year + " bir artık yıldır !");
        }else {
            System.out.println(year + " bir artık yıl değildir !");
        }


         */


    }
}
