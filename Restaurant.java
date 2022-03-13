
package restaurant;
      
public class Restaurant extends MenuRestaurant{
private MenuRestaurant[] menu;
private static byte id;

public Restaurant() {
    menu = new MenuRestaurant[10];
    for(int i=0; i<10; i++){
        menu[i] = new MenuRestaurant();
    }
    id = 1;
}
public void tambahMenuMakanan(String nama, double harga, int stok) {
this.menu[id].setNama_makanan(nama);
this.menu[id].setHarga_makanan(harga);
this.menu[id].setStok(stok);
}

public void mengurangiStokMakanan(String nama, int Jml){
    int stok = 0;
    for(int i=0; i<id; i++){
        if((menu[i].getNama_makanan()).equals(nama)){
            stok = menu[id].getStok()- Jml;
            menu[id].setStok(stok);
        }
    }
}   
        
        
public void tampilMenuMakanan(){
  System.out.println("========== Menu Makanan ==========");
    for(int i =0; i<=id;i++){
        if(!isOutOfStock(i)){
        System.out.println(this.menu[i].getNama_makanan() +"["+ this.menu[i].getStok()+"]"+"\tRp. "+ this.menu[i].getHarga_makanan());
         }
    }
    System.out.println("");
}

public void menambahPesanan (String nama, int Jml){
    double total = 0;
    int temp = 0;
    for(int i =0; i<=id;i++){
       if((menu[i].getNama_makanan()).equals(nama)){
        if(!isOutOfStock(i)){
            temp = menu[i].getStok()- Jml;
            menu[i].setStok(temp);
            total = Jml*menu[i].getHarga_makanan();
            pesanan(nama,total);
        }else{
        System.out.println("Stok habis");   
         }
       }  
    }
}

public void pesanan(String nama, double total){
    System.out.println("********* Pesanan **********");
    System.out.println(nama+ "\t\t\t\t" + total);
    System.out.println("");
}

public boolean isOutOfStock(int id){
if(this.menu[id].getStok() == 0){
    return true;
}else{
    return false;
}
}
public static void nextId(){
id++;
}

}




