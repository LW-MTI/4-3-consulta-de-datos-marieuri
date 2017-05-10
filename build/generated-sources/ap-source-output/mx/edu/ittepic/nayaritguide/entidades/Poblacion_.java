package mx.edu.ittepic.nayaritguide.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.ittepic.nayaritguide.entidades.Lugarturistico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-04T22:48:43")
@StaticMetamodel(Poblacion.class)
public class Poblacion_ { 

    public static volatile SingularAttribute<Poblacion, String> nombrepoblacion;
    public static volatile SingularAttribute<Poblacion, Integer> idmarca;
    public static volatile SingularAttribute<Poblacion, Integer> idpoblacion;
    public static volatile SingularAttribute<Poblacion, Integer> identidad;
    public static volatile ListAttribute<Poblacion, Lugarturistico> lugarturisticoList;

}