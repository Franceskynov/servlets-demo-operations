package com.franceskynov.model;

/**
 *
 * @author Franceskynov
 */
public class Operadores {
    /**
     *
     * @param d
     * @return
     */
    public Datos sumar(Datos d){
        
        d.setResultado(d.getNumA() + d.getNumB());
        
        return d;
    }

    /**
     *
     * @param d
     * @return
     */
    public Datos restar(Datos d){
        
        d.setResultado(d.getNumA() - d.getNumB());
        
        return d;
    }

    /**
     *
     * @param d
     * @return
     */
    public Datos multiplicar(Datos d){
        
        d.setResultado(d.getNumA() * d.getNumB());
        
        return d;
    }

    /**
     *
     * @param d
     * @return
     */
    public Datos dividir(Datos d){
        
        d.setResultado(d.getNumA() / d.getNumB());
        
        return d;
    }

    /**
     *
     * @param d
     * @return
     */
    public Datos exponenciacion(Datos d){
        
        if (d.getNumA() > 0 && d.getNumB() >0) {
            
            d.setResultado(Math.pow(d.getNumA(), d.getNumB()));
        
        }else{
        
            if (d.getNumB() <= -1){

                d.setResultado(Math.pow(d.getNumA(), d.getNumB()));

            }else{

                d.setResultado(1);
            }
        }
        
        return d;
    }

    /**
     *
     * @param num
     * @param root
     * @return
     */
    public double raiz(double num, double root)
    {
        return Math.pow(Math.E, Math.log(num) / root);
    }

    /**
     *
     * @param d
     * @return
     */
    public Datos radicacion(Datos d){
    
        if(d.getNumA() > 0 && d.getNumB() > 0){
            
            if(d.getNumB() == 2 || d.getNumB() == 1) {

                d.setResultado(Math.sqrt(d.getNumA()));

            }else{
                
                d.setResultado(raiz(d.getNumA(), d.getNumB()));
            }

        }else{

            if(d.getNumB() <= -1){

                d.setResultado(1 / d.getNumA());

            }else{

                d.setResultado(0);
            }
        }
        
        return d;
    }

    /**
     * Es
     * @param d
     * @return
     */
    public Datos cuadratica(Datos d){
        
        double w = 0, x = 0, x1 = 0, x2 = 0;

        w = Math.pow(d.getNumB(), 2) - (4 * (d.getNumA() * d.getNumC()));
        x = Math.sqrt(w);
        
        x1 = ((d.getNumB() * -1) + x) / (2 * d.getNumA());
        x2 = ((d.getNumB() * -1) - x) / (2 * d.getNumA());
        
        d.setX1(x1);
        d.setX2(x2);
        d.setResultado(0);
        
        return d;
    }
}