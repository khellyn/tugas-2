import java.util.Scanner;

import bangunruang.LimasSegitiga;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("---------- Mencari Volume Limas ----------");

        LimasSegitiga limassegitiga = new LimasSegitiga();

        System.out.print("Masukkan Luas Alas(cm) : ");
        limassegitiga.alas = keyboard.nextInt();
        System.out.print("Masukkan Tinggi(cm) : ");
        limassegitiga.tinggi = keyboard.nextInt();

        System.out.println("---------------------------------------------");

        limassegitiga.tampilkanVolumeLimas();

    }
}
