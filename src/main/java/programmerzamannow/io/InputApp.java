package programmerzamannow.io;

import java.util.Scanner;

public class InputApp {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan nama: ");
    String nama = scanner.nextLine();
    System.out.println("Halo " + nama);

  }

}
