import java.util.zip.ZipEntry;

public class edificio{
    public static void main(String[] args){
        for (int dia = 1; dia <=3; dia = dia+1){
            System.out.println("El dia es: " + dia);

            for (int hora = 1; hora <=24; hora = hora+1){
                float rayo = (float) Math.random();
                float ventana = (float) Math.random();
                float luz = (float) Math.random();
                int fila = (int) (Math.random() * (7 - 1) + 1);
                int columna = (int) (Math.random() * (5 - 1) + 1);
                
                System.out.println("La hora es: " + hora + " del dia " + dia);

                for (int i = 7; i >= 1; i = i-1 ){
                    System.out.print(i);
                    for (int j = 1; j <=5; j = j+1 ){

                            if(ventana <= 0.7 && columna <= i){
                                
                                if (rayo <= 0.25 && columna == j){
                                    System.out.print(" [T] "); // estropeada
                                } else if(luz <= 0.6 && fila >= j){
                                    System.out.print(" [o] "); // con luz
                                } else{
                                    System.out.print(" [.] "); // fuera luz
                                }
                            } else {
                                System.out.print(" [#] "); // cerrada
                            }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("Fin del dia " + dia);
        }
    }
}