package com.franceskynov.model;

/**
 *
 * @author Franceskynov
 */
public class Datos {
    private double NumA;
    private double NumB;
    private double NumC;
    private double Resultado;
    private double x1;
    private double x2;

    public Datos() {
        this.NumA = 0;
        this.NumB = 0;
        this.NumC = 0;
        this.Resultado = 0;
        this.x1 = 0;
        this.x2 = 0;
    }
    
    public double getNumA() {
        return NumA;
    }

    public void setNumA(double NumA) {
        this.NumA = NumA;
    }

    public double getNumB() {
        return NumB;
    }

    public void setNumB(double NumB) {
        this.NumB = NumB;
    }

    public double getNumC() {
        return NumC;
    }

    public void setNumC(double NumC) {
        this.NumC = NumC;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
}
