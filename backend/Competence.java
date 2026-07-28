package freelancers;
import jakarta.persistance.*;

@Entity
@Table(name = "categories")

public class Competence;{

  @id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

   private short idCompetence;
   private short nomCompetence;
   private short niveauCompetence;
   private String description;

    @ManyToOne
    @JoinColumn(name = "id_profil")
    private ProfilFreelancer profil

  public Short getIdCompetence(){return idCompetence;}
  public void setIdCompetence(Short idCompetence){this.idCompetence = idCompetence;}

    public Short getNomCompetence(){return nomCompetence;}
    public void setNomCompetence(Short nomCompetence){this.nomCompetence = nomCompetence;}

    public Short getNiveauCompetence(){return niveauCompetence;}
    public void setNiveauCompetence(Short niveauCompetence){this.niveauCompetence = niveauCompetence;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public ProfilFreelancer getProfil() { return profil;}
    public void setProfil(ProfilFreelancer profil) {this.profil = profil}
    

}