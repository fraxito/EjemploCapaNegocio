package clases;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author xp
 */
@ManagedBean
@SessionScoped
public class ListaEjercicios {

    private String[] ejercicios = {"makeBricks", "loneSum"};
    /**
     * Creates a new instance of ListaEjercicios
     */
    public ListaEjercicios() {
    }

    public String[] getEjercicios() {
        return ejercicios;
    }
    
}
