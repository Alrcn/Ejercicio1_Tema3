package Ejercicios_Tema3;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Empleado {


    public Empleado(){

    }
    public int getHoras() {
        return 30; // trabaja 30 horas semanales
    }

    public double getSalario() {
        return 30000.0; // 30,000.00 / año
    }

    public int getVacaciones() {
        return 10; // 2 semanas
    }
    public String getMesVacaciones() {
        return "Agosto"; } // mes de vacaciones


    @Override
    public String toString() {
        return
                "Trabajo " + getHoras() +
                ", Mi salario es: " +  getSalario() +
                ", Mis dias de vacaciones son: " + getVacaciones() +
                ", Mis vacaciones son en " + getMesVacaciones();
    }
}

