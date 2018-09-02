import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Apartament implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private Integer nr;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ap")
    private List<Contor> contoare;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ap")
    private List<Locatar> locatari;

    Apartament()
    {

    }

    Apartament(Integer nr, List<Contor> contoare)
    {
        this.nr = nr;
        this.contoare = contoare;
        for(Contor c:contoare)
        {
            c.setAp(this);
        }
        locatari = new ArrayList<Locatar>();
    }

    public void addLoc(Locatar loc) {
        locatari.add(loc);
        loc.setAp(this);
    }
}
