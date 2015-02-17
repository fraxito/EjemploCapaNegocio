package clases;




/**
 *
 * @author Gonzalo de las Heras
 */
public class Gonzalo {


    /**
     * Ejercicio 1, makeBricks
     *
     * @param small Número de ladrillos de longitud 1u.
     * @param big Número de ladrillos de longitud 5u.
     * @param goal Unidades de longitud a lograr.
     * @return retorna si es posible realizar la fila.
     */
    public boolean makeBricks(int small, int big, int goal) {
        // 5 * big + small longitud total.
        if (5 * big + small < goal) {
            // Si la suma de todos es menor que el nº a alcanzar, no se puede (ni de c%&$,
            // no se puede sacar de donde no hay).
            return false;
        } else {
            // Sí que puedo llegar pero necesito ver si tengo los suficientes 
            // "unos" para ajustar el nº.
            return goal % 5 <= small;
        }
    }

    /**
     * Ejercicio 2, loneSum.
     *
     * @param a nº 1.
     * @param b nº 2.
     * @param c nº 3.
     * @return retorna la suma de los números, pero si hay números repetidos,
     * estos no cuentan.
     */
    public int loneSum(int a, int b, int c) {
        int resul = 0;
        // Si a es distinto de b y c sumo a al resultado.
        if (a != b && a != c) {
            resul += a;
        }
        // Si b es distinto de b y c sumo b al resultado.
        if (b != a && b != c) {
            resul += b;
        }
        // Si c es distinto de b y c sumo c al resultado.
        if (c != b && c != a) {
            resul += c;
        }
        return resul;
    }

    /**
     * Ejercicio 3,luckySum.
     *
     * @param a nº 1.
     * @param b nº 2.
     * @param c nº 3.
     * @return retorna la suma de los números, pero si uno es 13, el resto no
     * cuentan.
     */
    public int luckySum(int a, int b, int c) {
        int resul = 0;
        if (a == 13) {
            // Si es 13 dejo el de ejecutar el algoritmo.
            return resul;
        } else {
            // Si no, sumo la variable.
            resul += a;
        }
        if (b == 13) {
            // Si es 13 dejo el de ejecutar el algoritmo.
            return resul;
        } else {
            // Si no, sumo la variable.
            resul += b;
        }
        if (c == 13) {
            // Si es 13 dejo el de ejecutar el algoritmo.
            return resul;
        } else {
            // Si no, sumo la variable.
            resul += c;
        }
        return resul;
    }

    /**
     * Ejercicio 4, noTeenSum.
     *
     * @param a nº 1.
     * @param b nº 2.
     * @param c nº 3.
     * @return retorna la suma de los números pero si uno está entre 13-19 (y no
     * es ni 15 ni 16), no cuenta.
     */
    public int noTeenSum(int a, int b, int c) {
        return fixteen(a) + fixteen(b) + fixteen(c);
    }

    /**
     * Ejercicio 4, función auxiliar.
     *
     * @param n
     * @return retorna la suma de los números pero si uno está entre 13-19 (y no
     * es ni 15 ni 16), no cuenta.
     */
    public int fixteen(int n) {
        if (n >= 13 && n <= 14 || n >= 17 && n <= 19) {
            return 0;
        } else {
            return n;
        }
    }

    /**
     * Ejercicio 5, roundSum.
     *
     * @param a nº 1.
     * @param b nº 2.
     * @param c nº 3.
     * @return retorna la suma de los números, pero antes estos los redondeamos.
     */
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    /**
     * Ejercicio 5, función auxiliar.
     *
     * @param num nº a redondear.
     * @return retorna el nº redondeado.
     */
    public int round10(int num) {
        if (num % 10 < 5) {
            return num - (num % 10);
        } else {
            return num - (num % 10) + 10;
        }
    }

    /**
     * Ejercicio 6, closeFar
     *
     * @param a nº 1.
     * @param b nº 2.
     * @param c nº 3.
     * @return retorna si b o c está a una distancia de 1u de a y el otro está a
     * una distancia de al menos 2u de los otros dos.
     */
    public boolean closeFar(int a, int b, int c) {
        boolean resul = false;
        // Calculo la distancias en valores absolutos.
        int dist1 = Math.abs(a - b);
        int dist2 = Math.abs(a - c);
        int dist3 = Math.abs(b - c);
        // Comparto las distancias.
        if (dist1 >= 0 && dist1 <= 1 && dist3 >= 2 && dist2 >= 2) {
            resul = true;
        }
        if (dist2 >= 0 && dist2 <= 1 && dist3 >= 2 && dist1 >= 2) {
            resul = true;
        }
        return resul;
    }

    /**
     * Ejercicio 7, blackjack.
     *
     * @param a nº 1.
     * @param b nº 2.
     * @return retorna el valor más cercano a 21 sin pasarse, y si los dos se
     * pasan, retorna 0.
     */
    public int blackjack(int a, int b) {
        // Vemos si a es mayor de 21.
        if (21 - a < 0) {
            a = 0;
        }
        // Vemos si b es mayor de 21.
        if (21 - b < 0) {
            b = 0;
        }
        // Devolvemos el mayor, ya nos hemos asegurado que no se pasa de 21.
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Ejercicio 8, evenlySpaced.
     *
     * @param a nº 1.
     * @param b nº 2.
     * @param c nº 3.
     * @return retorna si dados tres números, el menor y el mayor están a la
     * misma distancia de el del medio.
     */
    public boolean evenlySpaced(int a, int b, int c) {
        int num1;
        // Ordenamos los números
        if (a > b) {
            num1 = a;
            a = b;
            b = num1;
        }
        if (b > c) {
            num1 = b;
            b = c;
            c = num1;
        }
        if (a > b) {
            num1 = a;
            a = b;
            b = num1;
        }
        // Comparamos distancias.
        return (b - a) == (c - b);
    }

    /**
     * Ejercicio 9, makeChocolate.
     *
     * @param small Número de ladrillos de longitud 1u.
     * @param big Número de ladrillos de longitud 5u.
     * @param goal Unidades de longitud a lograr.
     * @return retorna el n! de "unos".
     */
    public int makeChocolate(int small, int big, int goal) {
        // 5 * big + small longitud total.
        if (5 * big + small < goal) {
            // Si la suma de todos es menor que el nº a alcanzar, no se puede.
            return -1;
        } else {
            // Sí que puedo llegar pero necesito ver si tengo los suficientes 
            // unos para ajustar el nº.
            if (goal % 5 <= small) {
                // Si que tengo los "unos" suficientes.
                if (goal - big * 5 > 4) {
                    // Si me faltan más de 5u.
                    if (big > small) {
                        // Corrección bug si big > small.
                        return goal % big;
                    } else {
                        // Si me faltan más de 5u y menos de 10u.
                        return goal % 5 + 5;
                    }
                } else {
                    // Si me faltan menos de 5u devuelvo el resto.
                    return goal % 5;
                }
            }
        }
        return -1;
    }

}
