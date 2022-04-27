//EXAMEN HECHO DE LA FORMA CORRECTA:
import java.lang.Math;
public class ExamenParcial1{
    public static void main(String[] args){

        int Rayo, AveriaPiso;
        int ColumnaAveriada, PisoAveriado;

        for(int Dias=1;Dias<=3;Dias++){
            Rayo = 0;
            ColumnaAveriada = 0;
            AveriaPiso = 0;
            PisoAveriado = 0;
            for(int Horas=1;Horas<=23;Horas++){
                if(Math.random() < (25/24/100) && Rayo==0){
                    Rayo = 1;
                    ColumnaAveriada = (int)(Math.random()*5+1);
                    System.out.println("===========================");
                    System.out.println("Cayo un rayo");
                }
                if(Math.random() < (15/24) && AveriaPiso==0){
                    AveriaPiso = 1;
                    PisoAveriado = (int)(Math.random()*7+1);
                    System.out.println("===========================");
                    System.out.println("Se averio un piso");
                }
                System.out.println("");
                System.out.println("Dia: " + Dias + " Hora: " + Horas);
                for(int Piso=1;Piso<=7;Piso++){
                    for(int Domicilio=1;Domicilio<=5;Domicilio++){
                        if(Rayo==1 && Domicilio==ColumnaAveriada){
                            System.out.print(" [R] ");
                        }
                        else if(AveriaPiso==1 && PisoAveriado==Piso){
                            System.out.print(" [P] ");
                        }
                        else{
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
                    }
                System.out.println("");
                }
            }
        }
    }
}