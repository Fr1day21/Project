
public class HitungBMI {
    private double tinggi, berat,ttl;
    private String inf;
    public double getTtl() {
        return ttl = this.berat / (this.tinggi * this.tinggi);
    }

    public String getInf() {
        return inf;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi/100;
    }

    public void setberat(double berat) {
        this.berat = berat;
    }
   void hasilinf(){
       if (getTtl() < 18.5){
           this.inf = "Anda Memiliki Masalah Kekurangan Berat Badan";
       }else if(getTtl() < 24.9){
           this.inf = "Anda Memiliki Berat Badan Ideal";
       }else if(getTtl() < 29.9){
           this.inf = "Anda Memiliki Berat Badan Berlebih";
       }else if(getTtl() > 30.0){
           this.inf = "Anda Memiliki Penyakit Obesitas";
       }
   }   
}
