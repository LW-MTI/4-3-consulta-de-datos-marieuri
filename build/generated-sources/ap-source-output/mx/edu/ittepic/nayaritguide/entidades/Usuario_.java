package mx.edu.ittepic.nayaritguide.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.ittepic.nayaritguide.entidades.Pais;
import mx.edu.ittepic.nayaritguide.entidades.Visita;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-04T22:48:43")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> nombreusuario;
    public static volatile SingularAttribute<Usuario, Pais> idpais;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile ListAttribute<Usuario, Visita> visitaList;
    public static volatile SingularAttribute<Usuario, String> correoelectronico;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;

}