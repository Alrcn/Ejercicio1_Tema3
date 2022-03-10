package Ejercicios_Tema3;

import java.util.Random;

public class Conserje extends Empleado {


    public int getHoras() {
        return 30; // trabaja 30 horas semanales
    }

    public double getSalario() {
        return 30000.0; // 30,000.00 / año
    }

    public int getVacaciones() {
        return 15; // 3 semanas
    }

    public String getMesVacaciones() {
        return "Septiembre"; //mes vacaciones
    }

}