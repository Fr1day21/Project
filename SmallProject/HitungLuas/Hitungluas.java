package hitungluas;

public class Hitungluas {
   private double jari,tinggi,alas,sisi,lling,lsegi,lper;

    private String info;

    public String getInfo() {
        return info;
    }
    public double getLling() {
        return lling = 3.14 *(this.jari * this.jari);
    }

    public double getLsegi() {
        return lsegi = 0.5 * this.alas * tinggi;
    }

    public double getLper() {
        return lper = this.sisi * this.sisi;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    void hasilPer(){
        if (getLper() > 0){
            this.info = "Luas Persegi Adalah :" + getLper() + "cm2";
        }
    }
    void hasilS(){
        if (getLsegi() > 0){
            this.info = "Luas Segitiga Adalah :" + getLsegi() + "cm2";
        }
    }void hasilL(){
        if (getLling() > 0){
            this.info = "Luas Lingkaran Adalah :" + getLling() +"cm2";
        }
    }
}