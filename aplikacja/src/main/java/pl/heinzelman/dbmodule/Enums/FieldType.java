package pl.heinzelman.dbmodule.Enums;

public enum FieldType {

        NAME_SHORT ( "Name" ),
        NAME_MARK  ( "Name_marketing" ),
        NAME_LONG  ("Name_long"),
        DESC_SHORT ("Description_simple"),
        DESC_MARK  ("Description_marketing"),
        DESC_LONG  ("Description_long");

        private final String str;

        FieldType( String str ) {
                this.str = str;
        }

        public String getStr() { return str; }
};
