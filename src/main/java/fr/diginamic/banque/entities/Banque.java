package fr.diginamic.banque.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "BANQUE")
public class Banque extends Adresse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOM", length = 50, nullable = false,unique=true)
    private String nom;

    @OneToMany(mappedBy = "banque" , cascade = CascadeType.PERSIST)
    private Set<Client> clients;

    // <--> Solution de Dimitri
    //ManyToOne
    //@JoinColum(name="id_client")
    //private Set<Client> clients;


    //Constructeur avec la classe adresse
    public Banque(int numero, String rue, int codePostal, String ville, String nom, Set<Client> clients) {
        super(numero, rue, codePostal, ville);
        this.nom = nom;
        this.clients = clients;
    }

    {
        clients = new HashSet<>();
    }

    public Banque() {
    }

    public Banque(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client) {
        if (client == null) {
            return;
        }
        // this.clients.add(client); -> se fait en caché dans setBanque
        client.setBanque(this);
    }

    public void removeClient(Client client) throws Exception {
        if (client == null) {
            return;
        }

        client.testSuppressionComptesOk(client.getComptes());

        this.clients.remove(client);
        client.getComptes().remove(this);
    }

    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", clients=" + clients +
                '}';
    }
}
