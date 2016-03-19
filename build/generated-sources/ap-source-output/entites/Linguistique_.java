package entites;

import entites.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-19T17:51:59")
@StaticMetamodel(Linguistique.class)
public class Linguistique_ { 

    public static volatile SingularAttribute<Linguistique, Integer> idLing;
    public static volatile ListAttribute<Linguistique, User> userList;
    public static volatile SingularAttribute<Linguistique, String> nomLing;
    public static volatile SingularAttribute<Linguistique, String> niveau;

}