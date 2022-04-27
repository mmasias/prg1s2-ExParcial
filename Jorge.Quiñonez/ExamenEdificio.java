// for(dias)
//     for(Horas)
//         for(plantas)
//             for(pisos)
//                 aqui probabilidad abuerto/cerrado
//                 Si esta abierto
//                     Aqui probabilidad encendido/apagado
                    
import java.lang.Math;
public class ExamenEdificio {
    public static void main(String[] args){
        
        int Dia, Horas, Pisos, Columnas;
        double ProbVentanaAbierta, ProbLuz;
        int PisoAveriado, ColumnaAveriada;
        double ProbRayo, ProbPisoAveriado;

        Dia = 1;
        Horas = 0;
        PisoAveriado = 0;
        ColumnaAveriada =0;
        Pisos = 1;
        Columnas = 0;

        while(Dia < 4){
            Dia = Dia + 1;
            ProbRayo = Math.random()*(100);
            ProbPisoAveriado = Math.random()*(100);

            if(ProbRayo <= 25){
                ColumnaAveriada = (int)(Math.random()*(5-1)+1);
            }
            if(ProbPisoAveriado <= 15){
               PisoAveriado = (int)(Math.random()*(7-1)+1); 
            }
            while(Horas < 24){
                Horas = Horas + 1;
                System.out.println("=============================================");
                System.out.println("Dia: "+ Dia + " Hora: " + Horas);
                while(Pisos <=7){
                    System.out.print(8 - Pisos);
                    if(PisoAveriado == Pisos){
                        while(Columnas<6){
                            System.out.print(" [T] ");
                            Columnas = Columnas + 1;
                        }
                    }
                    else{
                        while(Columnas <=5){
                            ProbVentanaAbierta = Math.random()*(100);
                            ProbLuz = Math.random()*(100);

                            if(ColumnaAveriada == Columnas){
                                System.out.print(" [T] ");
                            }
                            else if(ProbVentanaAbierta <= 30){
                                System.out.print(" [#] ");
                            }
                            else if(ProbVentanaAbierta > 30 && ProbLuz > 40){
                                System.out.print(" [0] "); 
                            }
                            else if(ProbVentanaAbierta > 30 && ProbLuz <= 40){
                                System.out.print(" [.] "); 
                            }
                            Columnas = Columnas + 1;
                        }
                    }
                    Columnas = 1;
                    Pisos = Pisos + 1;
                    System.out.println();
                }
                Pisos = 1;
            }

        }
    }
}