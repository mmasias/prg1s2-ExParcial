import java.lang.Math;
public class ExamenEdificio {
    public static void main(String[] args){
        
        int Dia, Horas, Pisos, Columnas;
        double ProbVentanaAbierta, ProbLuz;
        int PisoAveriado, ColumnaAveriada;
        double ProbRayo, ProbPisoAveriado;

        Dia = 1;
        Horas = 1;
        PisoAveriado = 0;
        ColumnaAveriada =0;
        Pisos = 1;
        Columnas = 0;

        while(Dia <=3){
            Dia = Dia + 1;
            ProbRayo = Math.random()*(100);
            ProbPisoAveriado = Math.random()*(100);

            if(ProbRayo <= 25){
                ColumnaAveriada = (int)(Math.random()*(5-1)+1);
            }
            if(ProbPisoAveriado <= 15){
               PisoAveriado = (int)(Math.random()*(7-1)+1); 
            }
            while(Horas < 25){
                Horas = Horas + 1;
                System.out.println("=============================================");
                System.out.println("Hora: " + Horas);
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

// while(Dia<=3){
//     Dia = Dia + 1;

//     for(int i=1;i<=5;i=i+1){
//         ProbRayo = Math.random();

//         if(ProbRayo >= 0.75 && ColumnaAveriada == 0){
//             ColumnaAveriada = i;
//         }
//     }
//     for(int j=1;j<=7;j=j+1){
//         ProbPisoAveriado = Math.random();

//         if(ProbPisoAveriado >= 0.85 && PisoAveriado == 0){
//             PisoAveriado = j;
//         }
//     }

//     for(int horas=0;horas<=24;horas=horas+1){
//         System.out.println();
//         System.out.println("Día: " + Dia + " Hora: " + horas);

//         for(int filas=7;filas>0;filas=filas-1){
//             System.out.print(filas);

//             for(int columnas=1;columnas<=5;columnas=columnas+1){
//                 ProbVentanaAbierta = (int)(Math.random()*(100));
//                 ProbLuz = (int)(Math.random()*(100));
//                 if(ProbVentanaAbierta < 0.7){
//                     VentanaAbierta = 1;
//                 }
//                 else{
//                     VentanaCerrada = 1;
//                 }

//                 if(ProbLuz > 40){
//                     LuzEncendida = 1;
//                 }
//                 else{
//                     LuzApagada = 1;
//                 }

//                 if(filas == PisoAveriado || columnas == ColumnaAveriada){
//                     System.out.print(" [T] ");
//                 }
//                 else if(VentanaAbierta==1){
//                     if(LuzEncendida==1){
//                         System.out.print(" [0] ");
//                     }
//                     else if(LuzApagada == 1){
//                         System.out.print(" [.] ");
//                     }
//                 }
//                 else if(VentanaCerrada == 1){
//                     System.out.print(" [#] " );
//                 }
//             }
//         System.out.println();
//         }
//     }
// }