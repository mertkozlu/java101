import java.util.Scanner;
public class Bankamatik {
    public static void main(String [] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int a;

        while (right > 0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();
            if(userName.equals("mertkozlu") && (password.equals("mert123"))) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1- Para Yatırma\n" + "2- Para Çekme\n" + "3- Bakiye Sorgulama\n" + "4- Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Yatıracağınız Tutarını Giriniz : ");
                        a = input.nextInt();
                        System.out.println(a +" Tl tutarındaki para yatırma işleminiz gerçekleştirildi.");
                        balance += a;
                        System.out.println("Hesabınızdaki Toplam Tutar : " + (balance) + "Tl"  );
                    } else if (select == 2) {
                        System.out.print("Çekeceğiniz Tutarı Giriniz : ");
                        a = input.nextInt();
                        if (a <= balance) {
                            System.out.println( a + " Tl tutarındaki para çekme işleminiz gerçekleştirildi.");
                            balance -= a;
                            System.out.println("Hesabınızdaki Toplam Tutar : " + (balance) + "Tl"  );
                        }else {
                            System.out.println("Yetersiz Bakiye !");
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance + "Tl");
                    }
                }while (select != 4);
                System.out.println("Güle güle..");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz !");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Edildi! ");
                }else{
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }

        }



    }
}
