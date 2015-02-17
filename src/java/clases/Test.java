/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author xp
 */
@ManagedBean
@SessionScoped
public class Test {

    String verde = "46cb5e";
    String rojo = "ff0000";
    Gonzalo g = new Gonzalo();
    /**
     * Creates a new instance of Test
     */
    public Test() {
    }
    public String testeaMakeBricks(){
        int[][] pruebas = { //MakeBricks
            {3, 1, 8, 1}, {3, 1, 9, 0}, {3, 2, 10, 1}, {3, 2, 8, 1}, {3, 2, 9, 0},
            {6, 1, 11, 1}, {6, 0, 11, 0}, {1, 4, 11, 1}, {0, 3, 10, 1}, {1, 4, 12, 0},
            {3, 1, 7, 1}, {1, 1, 7, 0}, {2, 1, 7, 1}, {7, 1, 11, 1}, {7, 1, 8, 1},
            {7, 1, 13, 0}, {43, 1, 46, 0}, {40, 1, 46, 0}, {40, 2, 47, 1}, {40, 2, 50, 1},
            {40, 2, 52, 0}, {22, 2, 33, 0}, {0, 2, 10, 1}, {1000000, 1000, 1000100, 1},
            {2, 1000000, 100003, 0},
            {20, 0, 19, 1}, {20, 0, 21, 0}, {20, 4, 51, 0}, {20, 4, 39, 1}
        };
        boolean resultadoPrueba;
        boolean respuestaCorrecta;
        String resultado = "<table class=\"table table-bordered table-condensed\"><tr>";
        
        for (int i=0; i < pruebas.length; i++){
           resultadoPrueba =  g.makeBricks(pruebas[i][0],pruebas[i][1], pruebas[i][2]);
           if (pruebas[i][3] != 0){respuestaCorrecta = true;}
           else { respuestaCorrecta = false;}
           
           if (respuestaCorrecta == resultadoPrueba){
               resultado = resultado + "<td bgcolor=\"#"+ verde + "\"></td>";
           }
           else {
               resultado = resultado + "<td bgcolor=\"#"+ rojo + "\"></td>";
           }
        }
        resultado = resultado + "</tr></table>";
        
        return resultado;
    }
}
