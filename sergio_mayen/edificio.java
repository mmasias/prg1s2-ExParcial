package sergio_mayen;
import java.util.Scanner;

public class edificio{
    public static void main(String[] args) {

        Scanner siguiente = new Scanner(System.in);

        int dia = 0, hora = 0;
        double ventanaAbiertaCerrada, ventanaEncendidaApagada;

        while(dia < 3){
            dia = dia + 1;

            int columnaEstropeada = 0;
            int plantaEstropeada = 0;

            for (int y = 1; y<=7; y++){ 
                double probabilidadAveria = Math.random();

                if(probabilidadAveria >= 0.85 && plantaEstropeada == 0){
                    plantaEstropeada = y;
                }
            }

            for (int x = 1; x<=5; x++){ 
                double probabilidadRayo = Math.random();

                if(probabilidadRayo >= 0.75 && columnaEstropeada == 0){
                    columnaEstropeada = x;
                }
            }

            ventanaAbiertaCerrada = Math.random();
            if(ventanaAbiertaCerrada <=0.30){
                System.out.println("Ventana cerrada " + ventanaAbiertaCerrada);
            }else{
                System.out.println("Ventana abierta " + ventanaAbiertaCerrada); 
            }


            ventanaEncendidaApagada = Math.random();
            if(ventanaEncendidaApagada <=0.40){
                System.out.println("Ventana apagada " +ventanaEncendidaApagada);
            }else{
                System.out.println("Ventana encendida " +ventanaEncendidaApagada);
            }

            for(hora = 0; hora <= 24; hora++){
                System.out.println("Hora " + hora + " del dia " + dia);
                for(int i = 7; i>0; i--){
                    System.out.print(i);
                    for(int j = 1; j<=5; j++){
                        if(i == plantaEstropeada || j == columnaEstropeada){
                            System.out.print(" [x] ");
                        }
                        else if(ventanaAbiertaCerrada > 0.7){
                            if(ventanaEncendidaApagada > 0.6){
                                System.out.print(" [O] ");
                            }
                            else{
                                System.out.print(" [.] ");
                            }
                        }
                        else{
                            System.out.print(" [#] ");
                        }
                    }
                    System.out.println(); 
                } 
                System.out.println("");
                siguiente.nextLine(); 
            }
        }
    }
}