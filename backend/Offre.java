package freelancers;
import jakarta.persistance.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "offre")

public class Offre;{

  @id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idOffre;
  private String titre;
  private String description;
  private Double prix;
  private String statut;
  private LocalDateTime dateCreation = LocalDateTime.now();

  @ManyToOne
  @JoinColumn(name = "id_freelancer")
  private Utilisateur freelancer;

   public Short getIdOffre(){return idOffre;}
    public void setIdOffre(Short idOffre){this.idOffre = idOffre;}

    public String getTitre(){return titre;}
    public void setTitre(String titre){this.titre = titre;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public Double getPrix(){return prix;}
    public void setPrix(String prix){this.prix = prix;}

    public String getStatut(){return statut;}
    public void setStatut(Utilisateur statut){this.statut = statut;}
    
    public LocalDateTime getDateCreation(){return dateCreation;}
    public void setDateCreation(LocalDateTime dateCreation){this.dateCreation = dateCreation;}

    public Utilisateur getFreelancer(){return freelancer;}
    public void setFreelancer(Utilisateur freelancer){this.freelancer = freelancer;}


}