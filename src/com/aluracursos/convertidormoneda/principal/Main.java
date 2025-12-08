package com.aluracursos.convertidormoneda.principal;

import com.aluracursos.convertidormoneda.accion.ConsultaMoneda;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String menu = """
                **************************************************
                Sea bienvenido al conversor de Moneda :)
                
                1) Dólar            =>> Peso Argentino
                2) Peso Argentino   =>> Dólar
                3) Dólar            =>> Real Brasileño
                4) Real Brasileño   =>> Dólar
                5) Dólar            =>> Peso Colombiano
                6) Peso Colombiano  =>> Dólar
                7) Salir
                Elige una opción válida:
                **************************************************
                """;
        int op = 0;
        double valor = 0, valorFinal;
        String moneda1 = "", moneda2 = "";
        Scanner teclado = new Scanner(System.in);

        while (op != 7){
            System.out.println(menu);
            try {
                op = teclado.nextInt();

                System.out.println("Ingrese el valor que desea convertir");
                valor = teclado.nextDouble();

                switch (op) {
                    case 1:
                        moneda1 = "[USD]";
                        moneda2 = "[ARS]";
                        break;
                    case 2:
                        moneda1 = "[ARS]";
                        moneda2 = "[USD]";
                        break;
                    case 3:
                        moneda1 = "[USD]";
                        moneda2 = "[BRL]";
                        break;
                    case 4:
                        moneda1 = "[BRL]";
                        moneda2 = "[USD]";
                        break;
                    case 5:
                        moneda1 = "[USD]";
                        moneda2 = "[COP]";
                        break;
                    case 6:
                        moneda1 = "[COP]";
                        moneda2 = "[USD]";
                        break;
                    case 7:
                        break;
                    default:
                        break;
                }

                if(op > 0 && op < 7){
                    ConsultaMoneda consulta = new ConsultaMoneda();
                    if(op % 2 == 0)
                        valorFinal = (1/consulta.consulta().get(op-2)) * valor;
                    else
                        valorFinal = (consulta.consulta().get(op-1)) * valor;

                    System.out.println("El valor " + valor + " " + moneda1 + " corresponde al valor final" +
                            " de =>>> " + valorFinal + " " + moneda2);
                }

            }catch (InputMismatchException e){
                System.out.println("NO se ingresó opción correcta");
                op = 7;
            }
        }
    }
}