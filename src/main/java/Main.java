import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String argsp[])
    {
        /* ------- Crearea unor noi contoare --------*/
        Contor c1 = new Contor("Bucatarie",112,Contor.ContorType.APA_CALDA);
        List<Contor> contorList = new ArrayList<Contor>();
        contorList.add(c1);
        /* ------------------------------------------*/
        /* ------- Crearea unor noi apartamente -----*/
        Apartament ap = new Apartament(1, contorList);
        List<Apartament> apList = new ArrayList<Apartament>();
        apList.add(ap);
        /* ------------------------------------------*/
        /* ------- Crearea unor noi locatari --------*/
        Locatar loc = new Locatar("Catalin","colari@aha.ro","1900000000");
        /* ------------------------------------------*/
        /* --Crearea unei asociatii de proprietari---*/
        AsociateProprietari asc = new AsociateProprietari(
                "ROINGIBAN",
                apList
        );
        //Inregistrarea unui nou locatar la un anumit apartament
        asc.register(ap, loc);
    }
}
