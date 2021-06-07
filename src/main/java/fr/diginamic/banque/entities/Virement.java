package fr.diginamic.banque.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("VIREMENT")
public class Virement extends Operation implements Serializable {

    @Column(name = "BENEFICIAIRE")
    private String beneficiaire;

    public Virement() {

    }

    public Virement(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public Virement(LocalDate date, double montant, String motif, String beneficiaire) {
        super(date, montant, motif);
        this.beneficiaire = beneficiaire;
    }


    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    @Override
    public String toString() {
        return "Virement{" +
                "beneficiaire='" + beneficiaire + '\'' +
                '}';
    }
}
