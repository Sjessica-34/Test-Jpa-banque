package fr.diginamic.banque.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("Virement")
public class Virement extends Operation implements Serializable {

    @Column(name = "BENEFICIAIRE", nullable = false)
    private String beneficiaire;

    public Virement() {
    }

    public Virement(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }


    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String toString() {
        return "Virement{" +
                "beneficiaire='" + beneficiaire + '\'' +
                '}';
    }
}
