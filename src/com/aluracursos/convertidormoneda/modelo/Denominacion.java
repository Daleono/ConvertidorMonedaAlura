package com.aluracursos.convertidormoneda.modelo;

public class Denominacion {
    private double ARS;
    private double BOB;
    private double BRL;
    private double CLP;
    private double COP;
    private double USD;

    private Denominacion(double ARS, double BOB, double BRL, double CLP, double COP, double USD){
        this.ARS = ARS;
        this.BOB = BOB;
        this.BRL = BRL;
        this.CLP = CLP;
        this.COP = COP;
        this.USD = USD;
    }

    public double getARS() {
        return ARS;
    }

    public double getBOB() {
        return BOB;
    }

    public double getBRL() {
        return BRL;
    }

    public double getCLP() {
        return CLP;
    }

    public double getCOP() {
        return COP;
    }


    public double getUSD() {
        return USD;
    }
}
