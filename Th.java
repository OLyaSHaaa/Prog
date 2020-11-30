public enum Th {
//    EARS("ушам"),
//    HAT("по шляпе"),
//    BOOTS("по башмакам"),
//    GRASS( "на траве "),
//    COAT("плащом"),
    BUT(", но"),
    NOW(" только что "),
    NOW2("ну а теперь "),
    AGAIN("снова"),
    LIKE(", как "),
    AFTER("затем "),
    STH( "что-нибудь ");
    private final String name;

    Th(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}