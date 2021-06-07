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
        System.out.println("connected db");
        em.getTransaction().begin();

        //Creation d'un CLIENT
        //insertion en base de donnée avec liaisons


//        Adresse adresse = new Adresse(6, "rue" , 21415, "Coruscant");
//        Client client = new Client("Skywalker", "Luke", LocalDate.now());
//        client.setAdresse(adresse);
//        client.addCompte(new Compte("345", 2145.985));
//        Banque banque = new Banque("DatariesBank");
//        client.setBanque(banque);
//
//        //System.out.println(client);
//
//        em.persist(client);
//

      // Creation d'une BANQUE
       // insertion en base de données avec liaisons

//        em.getTransaction().begin();
//       Banque banque = new Banque("toto");
//
//        Adresse adresse = new Adresse(6, "rue" , 31000, "Coruscant");
//        Client client = new Client("Skywalker", "Luke", LocalDate.of(1964,3,12));
//        client.setAdresse(adresse);
//        client.addCompte(new Compte("345", 2145985));
//
//        banque.addClient(client);
//
//       em.persist(banque);
//       em.getTransaction().commit();

    //Création de deux clients et ajout d'un compte

        Compte compte1 = new Compte ("123456789", 150_000.00);
        Banque banque = new Banque("la banque des Etoiles");

//        Adresse adresse = new Adresse(6, "rue des étoiles" , 31000, "Coruscant");
//        Client client1 = new Client("Skywalker", "Luke", LocalDate.of(1938,6,24));
//        client1.setAdresse(adresse);
//        client1.setBanque(banque);

//        Adresse adresse2 = new Adresse(12, "rue de la galaxie" , 21000, "Tatouine");
//        Client client2 = new Client("Solo", "Yann", LocalDate.of(1941,3,12));
//        client2.setAdresse(adresse2);
//        client2.setBanque(banque);

//        compte1.addClient(client1);
 //       compte1.addClient(client2);

//        em.persist(compte1);
//
       // insérer un client avec plusieurs comptes (AV et livretA) :


//        Client client3 = new Client("Dark", "Vador", LocalDate.of(1947, 5, 12));
//        Banque banqueB = new Banque("Banque de l'Etoile Noire");
//        Adresse adresseA = new Adresse(5, "rue de la galaxy", 25630, "Coruscant");
//        Compte assuranceVieAV = new AssuranceVie("789456123", 250, LocalDate.now().plusDays(20), 2);
//        Compte livretA = new LivretA("987654321", 14000, 1500);
//        client3.addCompte(assuranceVieAV);
//        client3.addCompte(livretA);
//        client3.setBanque(banqueB);
//        client3.setAdresse(adresseA);
//        em.persist(client3);
//
//
//        // insérer des opérations de type virements sur un compte
//
//        Operation virement1 = new Virement(LocalDate.now(), 10, "Rançon", "Jabba");
//        Operation virement2 = new Virement(LocalDate.now(), 150, "Livraison Bandit", "Jango");
//        Compte compte1 = new Compte("12569884212", 12547);
//        Compte compte2 = new Compte("123654789123", 12568);
//        compte2.addClient(client3);
//        compte2.addOperation(virement1);
//        compte2.addOperation(virement2);
//
//        //o insérer des opérations de type opérations sur un compte
//        Operation operation1 = new Operation(LocalDate.now(), 1200, "Rachat du Faucon Millenium");
//        Operation operation2 = new Operation(LocalDate.now(), 50, "Réparation Sabre Laser");
//        compte2.addOperation(operation1);
//        compte2.addOperation(operation2);
//        em.persist(compte1);
//        em.persist(compte2);
//
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

