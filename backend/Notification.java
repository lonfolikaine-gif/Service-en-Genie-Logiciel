package freelancers;
import jakarta.persistance.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification")

public class notification;{

  @id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Short idNotification;

  private String titre;
  private String message;
  private String statut;
  private LocalDateTime dateCreation = LocalDateTime.now();

  @ManyToOne
  @JoinColumn(name = "id_u")
  private Utilisateur utilisateur;

  public Short getIdNotification(){return idNotification;}
  public void setIdNotification(Short idNotification){this.idNotification = idNotification;}

   public String getTitre(){return titre;}
   public void setTitre(String titre){this.titre = titre;}

    public String getMessage(){return message;}
    public void setMessage(String message){this.message = message;}
    
    public String getStatut(){return statut;}
    public void setStatut(Utilisateur statut){this.statut = statut;}

    public LocalDateTime getDateCreation(){return dateCreation;}
    public void setDateCreation(LocalDateTime dateCreation){this.dateCreation = dateCreation;}

    public Utilisateur getUtilisateur(){return utilisateur;}
    public void setUtilisateur(Utilisateur utilisateur){this.utilisateur = utilisateur;}


}