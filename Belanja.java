import java.util.ArrayList;
import java.util.Scanner;

public class Belanja {
    private String produk;
    private int jumlah;

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotalBelanja() {
        return totalBelanja;
    }

    public void setTotalBelanja(double totalBelanja) {
        this.totalBelanja = totalBelanja;
    }

    private double subtotal;
    private double totalBelanja;
    public Belanja () {
        this.produk = produk;
        this.jumlah = jumlah;
        this.subtotal = subtotal;
        this.totalBelanja=0.0;
    }
    public Belanja (String produk, int jumlah, double subtotal, double total){

    }
    public Object CetakInvoid(){

        return null;
    }


    public static void main(String[] args) {
        int jum = 4;
        ArrayList<Belanja> p = new ArrayList<>();
        for (int index = 0; index<jum; index++){
            Belanja s= new Belanja();
            Scanner sc = new Scanner(System.in);
            System.out.println("type item name : ");
            s.setProduk(sc.nextLine());
            System.out.println("type item price : ");
            s.setJumlah(sc.nextInt());
            System.out.println("type item qty : ");
            s.setSubtotal(sc.nextInt());
            p.add(s);
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.format("total belanja", new Belanja().CetakInvoid());
    }
}
