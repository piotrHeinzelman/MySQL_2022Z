package pl.heinzelman.dbmodule.keyLogic;

public enum Lang {

    PL ( 1L, "zł","nr. kat.|%|cena|promocja","Produkty komplementarne:",2L),
    EN ( 3L, "€", "cat. no.|description|price|promo price","Complementary products:",2L ),
    CZ ( 2L, "Kč", "kat. č.|popis|cena|akční cena","Doplňkový sortiment:",1L ),
    HU ( 4L, "Ft", "cikkszám|leírás|ár|akciós ár","Kiegészítő termékek:",0L ),
    LT ( 5L, "€", "kat. num.|apibūdinimas|kaina|akcine kaina","Papildomi produktai:",2L ),
    RO ( 6L, "lei", "nr. cat.|descriere|preț|preț promo","Produse complementare:",2L ),
    LV ( 7L, "€", "kat. num.|apraksts|cena|akcijas cena","Papildus produkti:",2L ),
    SK ( 8L, "€", "kat. č.|popis|cena|akćná cena","Doplnkovy sortiment:",2L ),
    DE ( 9L, "?", "uzupełnić","niemiecki",2L ),
    EE ( 10L, "€", "Tellimuse nr|Nimi|Hind|Kampaaniahind","Täiendavad tooted:",2L ),
    ES ( 11L, "?", "hiszpański","hiszpański:",2L ),
    FR ( 12L, "?", "francuski","francuski:",2L ),
    RU ( 13L, "€", "Koд|Описание|Цена|Промо-цена","Дополняющие продукты:",2L ),
    NL ( 14L, "?", "holenderski","holenderski",2L ),
    UA ( 15L, "€", "Код|опис|ціна|акційна ціна","Комплементарні продукти:",2L ),
    HR ( 16L, "Kn", "Šifra|opis|cijena|promotivna cijena","Komplementarni proizvodi:",2L ),
    SI ( 17L, "€", "Koda|Opis|cena|promocijska cena","Dopolnilni izdelki:",2L ),
    BG ( 18L, "Bgn", "Код|Описание|цена|промо цена","Допълнителни продукти:",2L );


    private final Long ID_lang;
    private final String currency;
    private final String tableHeader;
    private final String complementaryHeader;
    private final Long precision;

    public static Lang getById(Long id) {
        for (Lang e : values()) {
            if (e.getID_lang().equals(id)) return e;
        }
        return null;
    }
    public static Lang getByCode( String code ) {
        for (Lang e : values()) {
            if (e.name().equals(code)) return e;
        }
        return null;
    }

    public Long getID_lang() { return ID_lang; }
    public String getCurrency() { return currency; }
    public String getTableHeader() { return tableHeader; }
    public String getComplementaryHeader() { return complementaryHeader; }
    public Long getPrecision() { return precision; }

    Lang(Long ID_lang, String currency, String tableHeader, String complementaryHeader, Long precision) {
        this.ID_lang = ID_lang;
        this.currency = currency;
        this.tableHeader = tableHeader;
        this.complementaryHeader = complementaryHeader;
        this.precision=precision;
    }
}


