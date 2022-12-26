import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();

        double perimeterCircle = 2* pi* r;
        double circleArea = pi* r*r ;

        System.out.println("Dairenin çevresi :" +perimeterCircle);
        System.out.println("Dairenin alanı : " +circleArea);



    }
}
