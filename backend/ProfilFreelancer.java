package freelancers;
import jakarta.persistance.*;
@Entity
@Table(name = "profil_freelance")


public class ProfilFreelancer {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Short idProfil;
    private String biographie;
    private String experience;
    private String localisation;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

    public Short getIdProfil(){return idProfil;}
    public void setIdProfil(Short idProfil){this.idProfil = idProfil;}

    public String getBiographie(){return biographie;}
    public void setBiographie(String biographie){this.biographie = biographie;}

    public String getExperience(){return experience;}
    public void setExperience(String experience){this.experience = experience;}

    public String getLocalisation(){return localisation;}
    public void setLocalisation(String localisation){this.localisation = localisation;}

    public Utilisateur getUtilisateur(){return utilisateur;}
    public void setUtilisateur(Utilisateur utilisateur){this.utilisateur = utilisateur;}


}
