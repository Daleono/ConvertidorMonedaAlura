package com.aluracursos.convertidormoneda.modelo;

import java.util.ArrayList;

public class Moneda {
    private Denominacion conversion_rates;

    public Moneda(Denominacion conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public Denominacion getConversion_rates() {
        return this.conversion_rates;
    }

    public ArrayList getValores(){
        ArrayList<Double> listaMoneda = new ArrayList<>();
        listaMoneda.add(conversion_rates.getARS());
        listaMoneda.add(conversion_rates.getUSD());
        listaMoneda.add(conversion_rates.getBRL());
        listaMoneda.add(conversion_rates.getUSD());
        listaMoneda.add(conversion_rates.getCOP());
        listaMoneda.add(conversion_rates.getUSD());

        return listaMoneda;
    }

    @Override
    public String toString() {
        return "(ARS=" + conversion_rates.getARS() + ", BOB=" + conversion_rates.getBOB() + ", BRL=" + conversion_rates.getBRL() +
                ", CLP= " + conversion_rates.getCLP() + ", COP=" + conversion_rates.getCOP() + ", USD=" +conversion_rates.getUSD();
    }
}


