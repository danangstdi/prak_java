import java.util.Scanner;

public class Prak_206 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan nilai Matematika-nya :");
        int matematika = masukan.nextInt();
        
        System.out.println("Masukkan nilai Fisika-nya :");
        int fisika = masukan.nextInt();

        if ((matematika > 80) && (fisika > 70)) {
            System.out.println("Siswa tersebut DITERIMA");
        } else {
            System.out.println("Siswa tersebut TIDAK DITERIMA");
        }
    }
}
