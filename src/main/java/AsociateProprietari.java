import java.util.List;

public class AsociateProprietari {

    private final HibernateLocatari dbHandler;
    private List<Apartament> apList;
    private final String IBAN;

    AsociateProprietari(String iban, List<Apartament> apList)
    {
        this.IBAN = iban;
        this.apList = apList;
        dbHandler = new HibernateLocatari();
    }

    public void register(Apartament ap, Locatar loc)
    {
        ap.addLoc(loc);
        dbHandler.insert(ap);
    }
}
