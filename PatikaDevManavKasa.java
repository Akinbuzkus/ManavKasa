
import java.util.Scanner;


public class PatikaDevManavKasa {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Kilo Armut Aldıgınızı Giriniz :");
        double Armut=scan.nextDouble();
        System.out.print("Kaç Kilo Elma Aldıgınızı Giriniz :");
        double Elma=scan.nextDouble();
        System.out.print("Kaç Kilo Domates Aldıgınızı Giriniz :");
        double Domates=scan.nextDouble();
        System.out.print("Kaç Kilo Muz Aldıgınızı Giriniz :");
        double Muz=scan.nextDouble();
        System.out.print("Kaç Kilo Patlican Aldıgınızı Giriniz :");
        double Patlican=scan.nextDouble();
        
        Armut=Armut*2.14;
        Elma=Elma*3.67;
        Domates=Domates*1.11;
        Muz=Muz*0.95;
        Patlican=Patlican*5.0;
        
        Double total=Armut+Elma+Domates+Muz+Patlican;
        System.out.println("Toplam Tutarr :"+total);
    }
 
}
