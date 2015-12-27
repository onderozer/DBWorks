package blc;

import db.VeritabaniIslemleri;

import java.sql.ResultSet;

/**
 * Created by dedeHan on 27.12.2015.
 */
public class KisiDB {

    VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();

    public void insertKisi(Kisi kisi)
    {
        String sqlText="INSERT INTO kisi (id,ad,soyad) VALUES (";

        kisi.setId(Long.parseLong(getSeqMax("kisi_id_seq")));

        if (kisi.getId()!=null) {
            sqlText += ""+kisi.getId();
        }

        if (kisi.getAd()!=null && !kisi.getAd().equals("")) {
            sqlText += ", '" + kisi.getAd() + "'";
        }

        if (kisi.getSoyad()!=null && !kisi.getSoyad().equals("")) {
            sqlText += ", '" + kisi.getSoyad()+ "')";
        }

        boolean sonuc = veritabaniIslemleri.insert(sqlText);

        if (sonuc) {
            System.out.println("Kişi eklendi" + kisi.getAd() + "" +kisi.getSoyad());
        }
    }

    public void getAll()
    {

        try {
            ResultSet rs = veritabaniIslemleri.select("SELECT * FROM kisi");

            while (rs.next()) {
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                Long id = rs.getLong("id");

                System.out.println("ID " + id + " AD= " + ad + " SOYAD= " + soyad);
            }

        } catch (Exception e) {
        }

    }

    private String getSeqMax(String seqName) {
        return "10";
    }


}
