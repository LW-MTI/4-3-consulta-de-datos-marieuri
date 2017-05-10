package mx.edu.ittepic.nayaritguide.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.ittepic.nayaritguide.entidades.Entidad;
import mx.edu.ittepic.nayaritguide.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-04T22:48:43")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile ListAttribute<Pais, Usuario> usuarioList;
    public static volatile SingularAttribute<Pais, Integer> idpais;
    public static volatile ListAttribute<Pais, Entidad> entidadList;
    public static volatile SingularAttribute<Pais, String> nombrepais;

}