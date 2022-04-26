import java.lang.Math;
public class ExamenEdificio {
    public static void main(String[] args){
        
        int Dia, VentanaAbierta, LuzEncendida;
        double ProbVentanaAbierta, ProbLuz;
        int PisoAveriado, ColumnaAveriada;
        double ProbRayo, ProbPisoAveriado;

        Dia = 1;
        VentanaAbierta = 0;
        LuzEncendida = 0;
        PisoAveriado = 0;
        ColumnaAveriada =0;

        while(Dia<3){
            Dia = Dia + 1;

            for(int i=1;i<=5;i=i+1){
                ProbRayo = Math.random();

                if(ProbRayo >= 0.75 && ColumnaAveriada == 0){
                    ColumnaAveriada = i;
                }
            }
            for(int j=1;j<=7;j=j+1){
                ProbPisoAveriado = Math.random();

                if(ProbPisoAveriado >= 0.85 && PisoAveriado == 0){
                    PisoAveriado = j;
                }
            }

            for(int horas=0;horas<=24;horas=horas+1){
                System.out.println();
                System.out.println("Día: " + Dia + " Hora: " + horas);

                for(int filas=7;filas>0;filas=filas-1){
                    System.out.print(filas);

                    for(int columnas=1;columnas<=5;columnas=columnas+1){
                        ProbVentanaAbierta = Math.random();
                        ProbLuz = Math.random();
                        if((int)ProbVentanaAbierta < 0.7){
                            VentanaAbierta = 1;
                        }

                        if((int)ProbLuz < 0.6){
                            LuzEncendida = 1;
                        }

                        if(filas == PisoAveriado || columnas == ColumnaAveriada){
                            System.out.print(" [T] ");
                        }
                        else if(VentanaAbierta==1){
                            if(LuzEncendida==1){
                                System.out.print(" [0] ");
                            }else{
                                System.out.print(" [.] ");
                            }
                        }
                        else{
                            System.out.print(" [#] " );
                        }
                    }
                System.out.println();
                }
            }
        }
    }
}
