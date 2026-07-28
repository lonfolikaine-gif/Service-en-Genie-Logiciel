package freelancers; 
import jakarta.persistance.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Short idUtilisateur;
    private String nom;
    private String prenom;
    private String mdpPasse;
    private String role;
    private LocalDateTime dateCreation;
    
    public Short getIdUtilisateur(){return idUtilisateur;}
    public void setIdUtilisateur(Short idUtilisateur){this.idUtilisateur = idUtilisateur;}
    
    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}

    public String getPrenom(){return prenom;}
    public void setPrenom(String prenom){this.prenom = prenom;}

    public String getMdpPasse(){return mdpPasse;}
    public void setMdpPasse(String mdpPasse){this.mdpPasse = mdpPasse;}

    public String getRole(){return role;}
    public void setRole(String role){this.role = role;}
    
    public LocalDateTime getDateCreation(){return dateCreation;}
    public void setDateCreation(LocalDateTime dateCreation){this.dateCreation = dateCreation;}

}