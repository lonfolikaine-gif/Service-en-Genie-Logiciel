package freelancers;
import jakarta.persistance.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "selection")

public class selection;{

  @id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private short idSelection;
  private LocalDateTime dateSelection = LocalDateTime.now();
  private String statut;

  @ManyToOne
  @JoinColumn(name = "id_client")
  private Utilisateur client;

  @ManyToOne
  @JoinColumn(name = "id_freelancer")
  private Utilisateur freelancer;

  @ManyToOne
  @JoinColumn(name = "id_offre")
  private Offre offre;

  public Short getIdSelection(){return idSelection;}
  public void setIdSelection(Short idSelection){this.idSelection = idSelection;}

  public LocalDateTime getDateSelection(){return dateCreation;}
  public void setDateSelection(LocalDateTime dateSelection){this.dateSelection = dateSelection;}

  public String getStatut(){return statut;}
  public void setStatut(Utilisateur statut){this.statut = statut;}

   public Utilisateur getClient(){return client;}
   public void setClient(Utilisateur client){this.client = client;}

   public Utilisateur getFreelancer(){return Freelancer;}
   public void setFreelancer(Utilisateur freelancer){this.freelancer = freelancer;}

   public Offre getOffre() { return Offre;}
   public void setOffre(Offre offre) {this.offre = offre;}



}