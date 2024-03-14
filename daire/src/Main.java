import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14;
        Scanner input =  new Scanner(System.in);
        System.out.print("Dairenin yarı çapını girin:");
        r=input.nextInt();
        double alan=(pi*r*r);
        System.out.println("Dairenin alanı:"+alan);
        double cevre=(2*pi*r);
        System.out.println("Dairenin çevresi:"+cevre);
        System.out.print("Merkez açı ölçüsünü giriniz.(0<a<360):");
        a=input.nextInt();
        double dilalan=(pi*r*r*a)/360;
        System.out.println("Dilimin alanı:"+dilalan);
    }
}