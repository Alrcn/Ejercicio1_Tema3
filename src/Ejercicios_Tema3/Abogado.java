package Ejercicios_Tema3;

public class Abogado extends Empleado {


    public int getHoras() {
        return 35; // trabaja 30 horas semanales
    }

    public double getSalario() {
        return 40000.0; // 30,000.00 / año
    }

    public int getVacaciones() {
        return 10; // 2 semanas
    }
    public String getMesVacaciones() {
        return "Julio"; }

    @Override
    public String toString() {
        return super.toString() + "“ Estoy en el tribunal";
    }
}
