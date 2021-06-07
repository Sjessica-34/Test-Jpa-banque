package fr.diginamic.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "LIVRET_A")
public class LivretA extends Compte implements Serializable {

    @Column(name = "TAUX", nullable = false)
    private double taux;

    public LivretA() {
    }

    public LivretA(double taux) {
        this.taux = taux;
    }

    public LivretA(String numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "LivretA{" +
                "taux=" + taux +
                '}';
    }
}
