
public class Soru {
    String soru,soruZorluk,soruCevap,soruTipi;
    double soruPuan;
    public Soru(String ss,String sz,double sp, String sc, String st){
        this.soru = ss;
        this.soruCevap = sc;
        this.soruTipi = st;
        this.soruZorluk = sz;
        this.soruPuan = sp;
    }
}
