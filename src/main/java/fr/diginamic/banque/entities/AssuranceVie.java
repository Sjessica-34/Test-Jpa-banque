package fr.diginamic.banque.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "ASSURANCE_VIE")
public class AssuranceVie extends Compte implements Serializable {

    @Column(name = "DATE_FIN", nullable = false)
    private LocalDate dateFin;

    @Column(name = "TAUX", nullable = false)
    private double taux;

    public AssuranceVie() {
    }

    public AssuranceVie(LocalDate dateFin, double taux) {
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public AssuranceVie(String numero, double solde, LocalDate dateFin, double taux) {
        super(numero, solde);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "AssuranceVie{" +
                "dateFin=" + dateFin +
                ", taux=" + taux +
                '}';
    }
}
