package blc;

/**
 * Created by dedeHan on 27.12.2015.
 */
public class Kisi {

    Long id;
    String ad;
    String soyad;

    public Kisi() {

    }

    public Kisi(Long id, String ad, String soyad) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }


}
