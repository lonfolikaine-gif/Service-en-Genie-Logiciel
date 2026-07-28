package freelancers;
import jakarta.persistance.*;

@Entity
@Table(name = "categories")

public class Categories{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idCategorie;
    private String nomCategorie;
    private String description;

    public Short getIdCategorie(){return idCategorie;}
    public void setIdCategorie(Short idCategorie){this.idCategorie = idCategorie;}

    public Short getNomCategorie(){return nomCategorie;}
    public void setNomCategirie(Short nomCategorie){this.nomCategorie = nomCategorie;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}
    
}