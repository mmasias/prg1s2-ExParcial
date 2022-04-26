package sergio_mayen;
import java.util.Scanner;

public class edificio{
    public static void main(String[] args) {

        Scanner siguiente = new Scanner(System.in);

        double ventanaAbiertaCerrada, ventanaEncendidaApagada, averia, rayo;
        int dia = 0;
        int matriz[][] = new int[7][5];	

        while(dia > 5 ){
            dia = dia + 1;

            for (int x=0; x < matriz.length; x++) {
                System.out.print("|");
                for (int y=0; y < matriz[x].length; y++) {
                  System.out.print (matriz[x][y]);
                  if (y!=matriz[x].length-1) System.out.print("\t");
                }
                System.out.println("|");
            }

            ventanaAbiertaCerrada = Math.random();
            if(ventanaAbiertaCerrada <= 0.30){
                System.out.println("Ventana cerrada" + ventanaAbiertaCerrada);
            }else{
                System.out.println("Ventana abierta" + ventanaAbiertaCerrada);
            }


            ventanaEncendidaApagada = Math.random();
            if(ventanaEncendidaApagada <= 0.40){
                System.out.println("Ventana apagada" +ventanaEncendidaApagada);
            }else{
                System.out.println("Ventana encendida" +ventanaEncendidaApagada);
            }

            rayo = Math.random();
            if(rayo <= 0.25){
                System.out.println("Rayo cayo :(" + rayo);
            }else{
                System.out.println("No paso nada :)" + rayo);
            }

            averia = Math.random();
            if(rayo <= 0.15){
                System.out.println("Se rompio fila :(" + averia);
            }else{
                System.out.println("No paso nada :)" + averia);
            }
        }
        
        System.out.println("");
        siguiente.nextLine();
    }
}