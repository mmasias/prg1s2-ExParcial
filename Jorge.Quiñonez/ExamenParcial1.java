import java.lang.Math;
public class ExamenParcial1{
    public static void main(String[] args){

        for(int Dias=1;Dias<=1;Dias++){
            for(int Horas=1;Horas<=1;Horas++){
                System.out.println("");
                System.out.println("Dia: " + Dias + " Hora: " + Horas);
                for(int Piso=1;Piso<=7;Piso++){
                    for(int Domicilio=1;Domicilio<=5;Domicilio++){
                        if(Math.random() < 0.7){
                            if(Math.random() < 0.6){
                                System.out.print(" [0] ");
                            }
                            else{
                                System.out.print(" [.] ");
                            }
                        }
                        else{
                            System.out.print(" [#] ");
                        }
                    }
                System.out.println("");
                }
            }
        }
    }
}