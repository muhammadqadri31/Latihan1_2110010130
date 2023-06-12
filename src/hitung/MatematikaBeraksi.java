package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika qadri = new Matematika(3,0);
        
        System.out.println("Hasil penjumlahan: "+qadri.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+qadri.setPengurangan());
        System.out.println("Hasil perkalian: "+qadri.setPerkalian());
        System.out.println("Hasil pembagian: "+qadri.setPembagian());
    }
}
