package entites;

import entites.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-09T01:41:05")
@StaticMetamodel(Experience.class)
public class Experience_ { 

    public static volatile SingularAttribute<Experience, String> ville;
    public static volatile ListAttribute<Experience, User> userList;
    public static volatile SingularAttribute<Experience, String> annee;
    public static volatile SingularAttribute<Experience, String> type;
    public static volatile SingularAttribute<Experience, String> commentaire;
    public static volatile SingularAttribute<Experience, Integer> nbMois;
    public static volatile SingularAttribute<Experience, Integer> idExperience;
    public static volatile SingularAttribute<Experience, String> pays;

}