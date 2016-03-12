package entites;

import entites.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-13T00:11:17")
@StaticMetamodel(Formation.class)
public class Formation_ { 

    public static volatile ListAttribute<Formation, User> userList;
    public static volatile SingularAttribute<Formation, String> nomFormation;
    public static volatile SingularAttribute<Formation, Integer> idFormation;
    public static volatile SingularAttribute<Formation, String> anneeFormation;
    public static volatile SingularAttribute<Formation, String> commentaireFormation;
    public static volatile SingularAttribute<Formation, String> lieuFormation;

}