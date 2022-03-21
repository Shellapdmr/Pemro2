/*
Nama : Shella P Dimara
*/

import java.util.Scanner;

class Truk {
    public static void main(String[] args){
        MobilTruk truck = new MobilTruk(1000);
        System.out.println("Muatan Maksimal = " + truck.getMuatanMaks());

        Scanner scan = new Scanner(System.in);
        System.out.print("Tambah Muatan : ");
        Double tambah1 = scan.nextDouble();
        truck.tambahMuatan (tambah1);

        System.out.print("Tambah Muatan : ");
        Double tambah2 = scan.nextDouble();
        truck.tambahMuatan (tambah2);

        System.out.print("Tambah Muatan : ");
        Double tambah3 = scan.nextDouble();
        truck.tambahMuatan (tambah3);

        System.out.print("Tambah Muatan : ");
        Double tambah4 = scan.nextDouble();
        truck.tambahMuatan (tambah4);

        System.out.println("Muatan sekarang : " + truck.getMuatan());
    }
}

class MobilTruk {
    static double muatan;
    static double muatanMaks;

    public MobilTruk(double beratMaks){
        this.muatanMaks = beratMaks;
    }
    public static double getMuatan() {
        if(muatan >= 1000) {
            muatan = muatanMaks - 50;
        }
        return muatan;
    }

    public static void tambahMuatan(double berat){
        muatan+=berat;
    }
    public double getMuatanMaks() {
        return muatanMaks;
    }
}

