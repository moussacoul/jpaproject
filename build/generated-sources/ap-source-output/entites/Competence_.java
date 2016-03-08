package entites;

import entites.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-08T01:02:30")
@StaticMetamodel(Competence.class)
public class Competence_ { 

    public static volatile ListAttribute<Competence, User> userList;
    public static volatile SingularAttribute<Competence, Integer> idComp;
    public static volatile SingularAttribute<Competence, String> domaine;
    public static volatile SingularAttribute<Competence, String> module;
    public static volatile SingularAttribute<Competence, String> commentaire;

}