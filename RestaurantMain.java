
package restaurant;

import java.util.Scanner;

public class RestaurantMain {
public static void main(String[] args) {
    int Jml;
    String nama;
    Restaurant menu = new Restaurant();
    menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Gehu ", 1_000, 20);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Tahu", 1_000, 0);
    Restaurant.nextId();
    menu.tambahMenuMakanan("Molen", 1_000, 20);
    
    menu.tampilMenuMakanan();
    
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan nama makanan ^u^ : ");
    nama = in.next();
    System.out.print("Masukkan jumlah makanan ^u^ : ");
    Jml = in.nextInt();
    System.out.println("mengurangi stok makanan sebanyak "+ Jml +" buah");
    menu.mengurangiStokMakanan(nama,Jml );
    menu.menambahPesanan(nama, Jml);
    menu.tampilMenuMakanan();
}
}

