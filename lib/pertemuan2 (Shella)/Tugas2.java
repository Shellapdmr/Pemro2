class Tugas2{
    public static void main(String[] args) {
        System.out.println("MOBIL");

        Mobil a = new Mobil();
        a.tampilkan();

        System.out.println("\nBUS");

        Bus p = new Bus();
        p.tampilkan();

        System.out.println("\nMOTOR");

        Motor k = new Motor();
        k.tampilkan();
    }
}

class Kendaraan {
    private String konsumsiBBM;
    private String kapasitasTank;

    public String getKonsumsiBBM(){
        return konsumsiBBM;
    }
    public void setKonsumsiBBM(String konsumsiBBM){
        this.konsumsiBBM = konsumsiBBM;
    }
    public String getKapasitasTank(){
        return kapasitasTank;
    }
    public void setKapasitasTank(String kapasitasTank){
        this.kapasitasTank = kapasitasTank;
    }

    public void tampilkandata(){
        System.out.println("Konsumsi BBM : " + getKonsumsiBBM());
        System.out.println("Kapasitas Tank : " + getKapasitasTank());
    }
    public void inputData(String kb, String kt){
        setKonsumsiBBM(kb);
        setKapasitasTank(kt);
    }
}

class Mobil extends Kendaraan{
    public void tampilkan(){
        String merk = "Avanza";
        String jenisBBM = "Pertalite";

        Kendaraan avanza = new Kendaraan();
        avanza.inputData("1.3 liter", "45 liter");
        avanza.tampilkandata();

        System.out.println("Merk Mobil : " + merk);
        System.out.println("Jenis BBM : " + jenisBBM);
    }
}

class Bus extends Kendaraan{
    public void tampilkan(){
        String besar = "Bus Pariwisata";
        String jumlahKursi = "30 sd 35 seat";

        Kendaraan pariwisata = new Kendaraan();
        pariwisata.inputData("0.5 liter", "2.400 liter");
        pariwisata.tampilkandata();

        System.out.println("Besar Bus : " + besar);
        System.out.println("Jumlah Kursi Bus : " + jumlahKursi);
    }
}

class Motor extends Kendaraan{
    public void tampilkan(){
        String jenisMesin = "4st, 1-cyl, SOHC, A/C berkapasitas 144 cc ";
        int tahunProduksi = 2009;

        Kendaraan klx = new Kendaraan();
        klx.inputData("6.6 liter", "1 liter");
        klx.tampilkandata();

        System.out.println("Jenis Mesin : " + jenisMesin);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}

