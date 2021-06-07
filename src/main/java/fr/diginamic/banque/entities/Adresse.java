package fr.diginamic.banque.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Adresse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToOne(mappedBy = "adresse")
    private Client client;

    @Column(name = "NUMERO", nullable = false)
    private int numero;

    @Column(name = "RUE", nullable = false, length = 50)
    private String rue;

    @Column(name = "CODE_POSTAL", nullable = false, length = 7)
    private int codePostal;

    @Column(name = "VILLE", nullable = false, length = 50)
    private String ville;


    public Adresse() {
    }

    public Adresse(int numero, String rue, int codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", rue='" + rue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
