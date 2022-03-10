package Ejercicios_Tema3;

public class Secretario extends Empleado{

    public int getHoras() {
        return 30; // trabaja 30 horas semanales
    }

    public double getSalario() {
        return 35000.0; // 35,000.00 / año
    }

    public int getVacaciones() {
        return 10; // 2 semanas
    }

    public String getMesVacaciones() {
        return "Agosto"; } // mes de vacaciones

    public String toString(){
        return super.toString() + " Estoy haciendo fotocopias";
    }
}
