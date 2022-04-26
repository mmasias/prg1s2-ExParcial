package sergio_mayen;
import java.util.Scanner;

public class edificio{
    public static void main(String[] args) {

        Scanner siguiente = new Scanner(System.in);

        int dia = 0, hora =0, alturaEdificio = 7, confirmarRayo = 0, confirmarAveria = 0, fila1, fila2, fila3, col1, col2, col3;
        double ventanaAbiertaCerrada, ventanaEncendidaApagada, averia, rayo;

        while(dia < 5){
            dia = dia + 1;

            ventanaAbiertaCerrada = Math.random();
            if(ventanaAbiertaCerrada <=0.30){
                System.out.println("Ventana cerrada" + ventanaAbiertaCerrada);
            }else{
                System.out.println("Ventana abierta" + ventanaAbiertaCerrada);
            }


            ventanaEncendidaApagada = Math.random();
            if(ventanaEncendidaApagada <=0.40){
                System.out.println("Ventana apagada" +ventanaEncendidaApagada);
            }else{
                System.out.println("Ventana encendida" +ventanaEncendidaApagada);
            }

            rayo = Math.random();
            if(rayo <=0.25){
                System.out.println("Se rompio columna " + rayo);
                confirmarRayo ++;
            }else{
                System.out.println("No paso nada :)" + rayo);
            }

            averia = Math.random();
            if(averia <=0.15){
                System.out.println("Se rompio fila " + averia);
                confirmarAveria ++;
            }else{
                System.out.println("No paso nada :)" + averia);
            }

            for(int i = 1; i <= 7; i++){
                for(int j = 1; j <= 5; j++){
                    if(confirmarAveria == 1 || confirmarRayo == 1){
                        averia = (int)(Math.random()*(7));
                        rayo = (int)(Math.random()*(5));
                        if(i==rayo || j==averia){
                            System.out.println("`" + j);
                            System.out.println("/" + i);
                        }
                    }
                    else{
                        System.out.print(" . ");
                    }
                }
                System.out.println();
            }

            averia = 0;
            confirmarAveria = 0;
            confirmarRayo = 0;
            System.out.println("");
            siguiente.nextLine();
        }
    }
}