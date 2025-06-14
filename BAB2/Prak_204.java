import java.util.Scanner;

public class Prak_204 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan angka 1 - 3 : ");
        int bil = masukan.nextInt();
        
        switch (bil) {
            case 1 : System.out.println("Satu");break;
            case 2 : System.out.println("Dua");break;
            case 3 : System.out.println("Tiga");
            default: System.out.println("Bilangan diluar range3");
        }
    }
}