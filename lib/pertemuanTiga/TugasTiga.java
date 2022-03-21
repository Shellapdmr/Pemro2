package pertemuanTiga;

class TugasTiga{
    public static void main(String[] args) {
        SegiEmpat segiempatt = new SegiEmpat(4);
        SegiTiga segitigaa = new SegiTiga(4, 7);
        Lingkaran lingkarann = new Lingkaran(7);

        segiempatt.hitungKeliling();
        segiempatt.hitungLuas();
        segitigaa.hitungKeliling();
        segitigaa.hitungLuas();
        lingkarann.hitungKeliling();
        lingkarann.hitungLuas();
    }
}

abstract class Geometri{
    public abstract void hitungKeliling();
    public abstract void hitungLuas();
}

class SegiEmpat extends Geometri{
    double sisi;

    public SegiEmpat(double sisi){
        this.sisi = sisi;
    }

    @Override
    public void hitungKeliling() {
        double hitungkeliling = 4*sisi;
        System.out.println("Keliling SegiEmpat :" + hitungkeliling);
    }
    
    @Override
    public void hitungLuas() {
        double hitungluas = sisi*sisi;
        System.out.println("Luas SegiEmpat : " + hitungluas);
    }
}

class SegiTiga extends Geometri{
    double sisi;
    double tinggi;

    public SegiTiga(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungKeliling(){
        double hitungkeliling = sisi + sisi + sisi;
        System.out.println("Keliling SegiTiga : " + hitungkeliling);
    }

    @Override
    public void hitungLuas(){
        double hitungluas = sisi + sisi + sisi;
        System.out.println("Luas SegiTiga : " + hitungluas);
    }
}

class Lingkaran extends Geometri{
    double jariJari;
    final double pi = 3.14;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    @Override
    public void hitungKeliling(){
        double hitungkeliling = 2*pi*jariJari;
        System.out.println("Keliling Lingkaran :" + hitungkeliling);
    }

    @Override
    public void hitungLuas(){
        double hitungluas = 2*pi*jariJari;
        System.out.println("Luas Lingkaran :" + hitungluas);
    }
}


