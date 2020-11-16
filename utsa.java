import java.util.Scanner;
public class utsa {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        int menu1, menu2, porsi1, porsi2, harga, bayar1, bayar2, total, voucher, totalAkhir;
        double diskon = 0.05;
        int harga1 = 22000, harga2 = 18000, harga3 = 28000, harga4 = 12000, harga5 = 16500;

        System.out.println("1. Menu Soto, Harga Rp 22.000");
        System.out.println("2. Menu Bakso, Harga Rp 18.000");
        System.out.println("3. Menu Sate, Harga Rp 28.000");
        System.out.println("4. Menu Nasi Kuning, Harga Rp 12.000");
        System.out.println("5. Menu Sop Ayam, Harga Rp 16.000");

        System.out.println("Masukkan Kode Menu Pertama : ");
        menu1 = x.nextInt();
        System.out.println("Masukkan Porsi makanan : ");
        porsi1 = x.nextInt();
        System.out.println("Masukkan Kode Menu Kedua : ");
        menu2 = x.nextInt();
        System.out.println("Masukkan Porsi Makanan : ");
        porsi2 = x.nextInt();

        if (menu1 == 1){
                bayar1 = harga1 * porsi1;
                System.out.println("Menu Pertama: Rp." + bayar1);
            }else if (menu1 == 2){
                bayar1 = harga2 * porsi1;
                System.out.println("Menu Pertama: Rp." + bayar1);
            }else if (menu1 == 3){
                bayar1 = harga3 * porsi1;
                System.out.println("Menu Pertama: Rp." + bayar1);
            }else if (menu1 == 4){
                bayar1 = harga4 * porsi1;
                System.out.println("Menu Pertama: Rp." + bayar1);
            }else{ 
                bayar1 = harga5 * porsi1;
                System.out.println("Menu Pertama: Rp." + bayar1);
            }

        if (menu2 == 1){
                bayar2 = harga1 * porsi2;
                System.out.println("Menu Kedua: Rp." + bayar2);
            }else if (menu2 == 2){
            bayar2 = harga2 * porsi2;
            System.out.println("Menu Kedua: Rp." + bayar2);
            }else if(menu2 == 3){
            bayar2 = harga3 * porsi2;
            System.out.println("Menu Kedua: Rp." + bayar2);
            }else if (menu2 == 4){
            bayar2 = harga4 * porsi2;
            System.out.println("Menu Kedua: Rp." + bayar2);
            }else{
            bayar2 = harga5 * porsi2;
            System.out.println("Menu Kedua: Rp." + bayar2);
            }
            total = bayar1 + bayar2;
            System.out.println("Total: Rp." + total);

            if (total >= 70000){
                System.out.println("Anda Mendapatkan Voucher");
                if (menu1 == 1){
                    voucher =  total * 5/100;
                    System.out.println("Anda mendapatkan voucher sebesar Rp." + voucher);
                    totalAkhir = total - voucher;
                    System.out.println("Total Akhir Anda Menjadi Rp." + totalAkhir);
                }else if(menu2 == 2){
                    voucher = total * 5/100;
                    System.out.println("Anda mendapatkan Voucher Sebesar Rp." + voucher);
                    totalAkhir = total - voucher;
                    System.out.println("Total Akhir Anda Menjadi Rp." + totalAkhir);
                }else{
                    System.out.println("Tidak Ada Potongan Harga");
                }
            }else {
                System.out.println("Selamat Anda Mendapatkan Es Teh Manis Gratis");
            }


    }
}
