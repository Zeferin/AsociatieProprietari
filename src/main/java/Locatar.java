import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Locatar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nume;
    @Column(unique = true, nullable = false, length = 100)
    private String email;
    @Column(unique = true, nullable = false, length = 13)
    private String cnp;
    @ManyToOne
    private Apartament ap;

    Locatar()
    {

    }

    Locatar(String nume, String email, String cnp)
    {
        this.nume = nume;
        this.email = email;
        this.cnp = cnp;
    }

    public void setAp(Apartament apartament) {
        this.ap = apartament;
    }
}
