package fr.diginamic.banque.testJpa;

import fr.diginamic.banque.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class TestBanque {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
        EntityManager em = emf.createEntityManager();

        //Creation d'un CLIENT
        //insertion en base de donnée avec liaisons

//        em.getTransaction().begin();
//        Adresse adresse = new Adresse(6, "rue" , 21415, "Coruscant");
//        Client client = new Client("Skywalker", "Luke", LocalDate.now());
//        client.setAdresse(adresse);
//        client.addCompte(new Compte("345", 2145985));
//        Banque banque = new Banque("laposte");
//        client.setBanque(banque);
//
//        em.persist(client);
//        em.getTransaction().commit();

      // Creation d'une BANQUE
       // insertion en base de données avec liaisons

//        em.getTransaction().begin();
//       Banque banque = new Banque("toto");
//
//        Adresse adresse = new Adresse(6, "rue" , 31000, "Coruscant");
//        Client client = new Client("Skywalker", "Luke", LocalDate.now());
//        client.setAdresse(adresse);
//        client.addCompte(new Compte("345", 2145985));
//
//        banque.addClient(client);
//
//        em.persist(banque);
//       em.getTransaction().commit();

    //Création de deux clients et ajout d'un compte

        Compte compte = new Compte ("123456789", 150_000);

        Adresse adresse = new Adresse(6, "rue" , 31000, "Coruscant");
        Client client1 = new Client("Skywalker", "Luke", LocalDate.now());
        client1.setAdresse(adresse);

        Adresse adresse2 = new Adresse(12, "rue" , 21000, "Tatouine");
        Client client2 = new Client("Solo", "Yann", LocalDate.now());
        client2.setAdresse(adresse);

        client1.addCompte(compte);
        client2.addCompte(compte);

        em.persist(client1);
        em.persist(client2);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}