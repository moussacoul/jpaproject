package entites;

import entites.Centreinteret;
import entites.Competence;
import entites.Experience;
import entites.Formation;
import entites.Linguistique;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-19T17:51:59")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile ListAttribute<User, Linguistique> linguistiqueList;
    public static volatile ListAttribute<User, Centreinteret> centreinteretList;
    public static volatile ListAttribute<User, Experience> experienceList;
    public static volatile SingularAttribute<User, String> pass;
    public static volatile SingularAttribute<User, String> telephone;
    public static volatile SingularAttribute<User, String> nom;
    public static volatile ListAttribute<User, Competence> competenceList;
    public static volatile SingularAttribute<User, Integer> idUser;
    public static volatile SingularAttribute<User, String> titreCV;
    public static volatile ListAttribute<User, Formation> formationList;
    public static volatile SingularAttribute<User, String> adresse;
    public static volatile SingularAttribute<User, String> prenom;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Date> dateNaissassance;

}