package pl.heinzelman.dbmodule.STATIC_CLASS;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LangService extends AbstractDictService<Lang> {


    @Autowired private final LangRepo langRepo;

    public LangService( LangRepo codev2Repo ) {
        this.langRepo = codev2Repo;
    }

       // LOAD PRODUCT !!!
       public List<Map<String, Object>> loadProduct(Long codeId, Long langId, Long issueId) {
            return langRepo.loadProduct( codeId, langId, issueId );
        }


        public boolean initialize(){

            try { langRepo.init1(); } catch(RuntimeException e) { System.out.println( "\n** ADD SQL FUNCTION **"+e ); }
            try { langRepo.init2(); } catch(RuntimeException e) { System.out.println( "\n** ADD SQL FUNCTION **"+e ); }

            if ( count()!=0 ) return false;
            Lang pl = new Lang("PL");
            pl.setId( 1L );
            pl.setCurrency("zł");
            pl.setTableHeader("nr. kat.|%|cena|promocja");
            pl.setComplementaryHeader("Produkty komplementarne:");
            pl.setPrecision(2L);
            save(pl);

            Lang cz = new Lang("CZ");
            cz.setId( 2L );
            cz.setCurrency("Kč");
            cz.setTableHeader("kat. č.|popis|cena|akční cena");
            cz.setComplementaryHeader("Doplňkový sortiment:");
            cz.setPrecision(1L);
            save(cz);

            Lang en = new Lang("EN");
            en.setId( 3L );
            en.setCurrency("€");
            en.setTableHeader("cat. no.|description|price|promo price");
            en.setComplementaryHeader("Complementary products:");
            en.setPrecision(2L);
            save(en);

            Lang hu = new Lang("HU");
            hu.setId( 4L );
            hu.setCurrency("Ft");
            hu.setTableHeader("cikkszám|leírás|ár|akciós ár");
            hu.setComplementaryHeader("Kiegészítő termékek:"); // Készlet tartalmazza: ?
            hu.setPrecision(0L);
            save(hu);

            Lang lt = new Lang("LT");
            lt.setId( 5L );
            lt.setCurrency("€");
            lt.setTableHeader("kat. num.|apibūdinimas|kaina|akcine kaina");
            lt.setComplementaryHeader("Papildomi produktai:");
            lt.setPrecision(2L);
            save(lt);

            Lang ro = new Lang("RO");
            ro.setId( 6L );
            ro.setCurrency("lei");
            ro.setTableHeader("nr. cat.|descriere|preț|preț promo");
            ro.setComplementaryHeader("Produse complementare:");
            ro.setPrecision(2L);
            save(ro);

            Lang lv = new Lang("LV");
            lv.setId( 7L );
            lv.setCurrency("€");
            //lv.setTableHeader("kat. num.|cena|?|akcijas cena");
            lv.setTableHeader("kat. num.|apraksts|cena|akcijas cena");
            lv.setComplementaryHeader("Papildus produkti:");
            lv.setPrecision(2L);
            save(lv);
            //kat. num.|apraksts|cena|akcijas cena
            //"kat. num.|cena|?|akcijas cena");

            Lang sk = new Lang("SK");
            sk.setId( 8L );
            sk.setCurrency("€");
            sk.setTableHeader("kat. č.|popis|cena|akćná cena");
            sk.setComplementaryHeader("Doplnkovy sortiment:");
            sk.setPrecision(2L);
            save(sk);


            Lang de = new Lang("DE");
            de.setId( 9L );
            de.setCurrency("?");
            de.setTableHeader("?");
            de.setComplementaryHeader("niemiecki");
            de.setPrecision(2L);
            save(de);


            Lang ee = new Lang("EE"); //Estonski
            ee.setId( 10L );
            ee.setCurrency("€");
            ee.setTableHeader("Tellimuse nr|Nimi|Hind|Kampaaniahind");
            ee.setComplementaryHeader("Täiendavad tooted:");
            ee.setPrecision(2L);
            save(ee);


            Lang es = new Lang("ES"); // hiszpanski
            es.setId( 11L );
            es.setCurrency("?");
            es.setTableHeader("?");
            es.setComplementaryHeader("hiszpański");
            es.setPrecision(2L);
            save(es);

            Lang lan = null;
            lan = new Lang("FR"); // francuski
            lan.setId( 12L );
            lan.setCurrency("?");
            lan.setTableHeader("?");
            lan.setComplementaryHeader("francuski");
            lan.setPrecision(2L);
            save(lan);

            lan = null;
            lan = new Lang("RU"); // ruski
            lan.setId( 13L );
            lan.setCurrency("€");
            lan.setTableHeader("Koд|Описание|Цена|Промо-цена");
            lan.setComplementaryHeader("Дополняющие продукты:");
            lan.setPrecision(2L);
            save(lan);


            lan = null;
            lan = new Lang("NL"); // holenderski
            lan.setId( 14L );
            lan.setCurrency("?");
            lan.setTableHeader("?");
            lan.setComplementaryHeader("holenderski");
            lan.setPrecision(2L);
            save(lan);

            lan = null;
            lan = new Lang("UA"); // Ukraiński
            lan.setId( 15L );
            lan.setCurrency("€");
            lan.setTableHeader("Код|опис|ціна|акційна ціна");
            lan.setComplementaryHeader("Комплементарні продукти:");
            lan.setPrecision(2L);
            save(lan);


            Lang hr = new Lang("HR");
            hr.setId( 16L );
            hr.setCurrency("Kn");
            hr.setTableHeader("Šifra|opis|cijena|promotivna cijena");
            hr.setComplementaryHeader("Komplementarni proizvodi:");
            hr.setPrecision(2L);
            save(hr);

            Lang si = new Lang("SI");
            si.setId( 17L );
            si.setCurrency("€");
            si.setTableHeader("Koda|Opis|cena|promocijska cena");
            si.setComplementaryHeader("Dopolnilni izdelki:");
            si.setPrecision(2L);
            save(si);

            Lang bg = new Lang("BG");
            bg.setId( 18L );
            bg.setCurrency("Bgn");
            bg.setTableHeader("Код|Описание|цена|промо цена");
            bg.setComplementaryHeader("Допълнителни продукти:");
            bg.setPrecision(2L);
            save(bg);



            return true;

    }

}
