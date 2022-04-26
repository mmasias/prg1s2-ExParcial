import java.lang.Math;
public class ExamenEdificio {
    public static void main(String[] args){
        
        double ProbVentanaCerrada, ProbVentanaAbierta, ProbLuzApagada, ProbLuzEncendida;

        for(int tiempo=1;tiempo<=3;tiempo=tiempo+1){

            ProbVentanaAbierta = Math.random()*(100);
            ProbVentanaCerrada = Math.random()*(100);
            ProbLuzApagada = Math.random()*(100);
            ProbLuzEncendida = Math.random()*(100);

            for (int i = 0; i <= 7; i = i+1 ){
                System.out.print(i);
                for (int j=0; j <=5; j=j+1){
                    if(ProbVentanaAbierta <= 70){
                        if(ProbLuzEncendida <= 60){
                            System.out.print(" [o] ");
                        } else{
                            System.out.print(" [.] ");
                        }
                    }
                }
            }
        }
    }
}

// for(int nivel=0;nivel<=profundidadPozo;nivel++){
        
//     if(((int)profundidadCaracol)==nivel){
//         System.out.println("[] :.  _@)_/'  :. [] _ __" + nivel);
//     }
//     else if(nivel>profundidadPozo-profundidadAgua){
//         System.out.println("[] ~~~~~~~~~~~~~~ [] _ __" + nivel);
//     }
//     else{
//         System.out.println("[] :. :. :. :. :. [] _ __" + nivel);
//     }
// }