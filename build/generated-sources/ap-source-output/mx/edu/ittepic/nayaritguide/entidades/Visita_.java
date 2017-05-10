package mx.edu.ittepic.nayaritguide.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.ittepic.nayaritguide.entidades.Lugarturistico;
import mx.edu.ittepic.nayaritguide.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-04T22:48:43")
@StaticMetamodel(Visita.class)
public class Visita_ { 

    public static volatile SingularAttribute<Visita, Integer> idvisita;
    public static volatile SingularAttribute<Visita, Integer> calificacion;
    public static volatile SingularAttribute<Visita, Lugarturistico> idlugarturistico;
    public static volatile SingularAttribute<Visita, Integer> tiposubida;
    public static volatile SingularAttribute<Visita, String> comentarios;
    public static volatile SingularAttribute<Visita, Usuario> idusuario;

}