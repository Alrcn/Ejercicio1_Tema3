package Ejercicios_Tema3;

public class Main {

    public static void main(String[] args) {
	    
        
        
        //Clases:
        Empleado [] arrayE = new Empleado[10];
        Secretario s1 = new Secretario();
        Abogado a1 = new Abogado();
        Conserje c1 = new Conserje();



//--------------------Rellenamos el array------------------------------------------
            for (int i= 0; i<arrayE.length ; i++){
                int aux = (int) (Math.random()*3);

                if (aux == 0){
                    arrayE[i] = new Abogado();
                }else if(aux == 1){
                    arrayE[i] = new Conserje();
                }else if(aux == 2){
                    arrayE[i] = new Secretario();
                }
            }

            for (int j= 0; j<arrayE.length ; j++){

                System.out.println("\n Mis vacaciones: "+arrayE[j].getVacaciones()+", Mi mes de vacaciones: "+arrayE[j].getMesVacaciones()
                 +", Mi salario: "+arrayE[j].getSalario()+", Mis horas de trabajo son: " +arrayE[j].getHoras());
            }






    }
}
