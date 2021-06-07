package fr.diginamic.banque.entities;
import fr.diginamic.banque.ListService;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "COMPTE")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte implements Serializable {

 @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "ID")
 private Long id;

 @Column(name = "NUMERO", length = 50,nullable = false, unique = true)
 private String numero;

 @Column(name = "SOLDE", nullable = false)
 private double solde;

 //<-------------->

 @ManyToMany(mappedBy = "comptes")
 private Set<Client> clients;

 @OneToMany(mappedBy = "compte", cascade = CascadeType.PERSIST)
 private Set<Operation> operations;

 {
  clients = new HashSet<>();
  operations = new HashSet<>();
 }

 public Compte() {
 }

 public Compte(String numero, double solde) {
  this.numero = numero;
  this.solde = solde;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getNumero() {
  return numero;
 }

 public void setNumero(String numero) {
  this.numero = numero;
 }

 public double getSolde() {
  return solde;
 }

 public void setSolde(double solde) {
  this.solde = solde;
 }

 public Set<Client> getClients() {
  return clients;
 }

 public void setClients(Set<Client> clients) {
  if (clients == null){
   return;
  }
  this.clients = clients;
 }

 public Set<Operation> getOperations() {
  return operations;
 }

 public void setOperations(Set<Operation> operations) {
  this.operations = operations;
 }

 public void addOperation(Operation operation) {
  if (operation == null){
   return;
  }
  operation.setCompte(this);
 }

 public void removeOperation(Operation operation) throws Exception {

 }

 public void addClient(Client client) {
  if (client == null) {
   return;
  }

  //Ajout du compte dans la liste de compte du client
  client.getComptes().add(this);
  //Ajout du client
  this.clients.add(client);
 }

 public void removeClient(Client client) throws Exception {
  if (client == null) {
   return;
  }


  this.testSuppressionClientOk(this.clients);

  client.testSuppressionComptesOk(client.getComptes());

  client.getComptes().remove(this);
  this.clients.remove(client);
 }

 public void testSuppressionClientOk(Set<Client> list) throws Exception {
  if (ListService.isNullAfterRemove(list)){
   throw new Exception("clients can't be empty");
  }
 }

 @Override
 public String toString() {
  return "Compte{" +
          "id=" + id +
          ", numero='" + numero + '\'' +
          ", solde=" + solde +
          ", clients=" + clients +
          ", operations=" + operations +
          '}';
 }
}
