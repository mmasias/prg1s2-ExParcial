import java.util.zip.ZipEntry;
public class edificio{
    public static void main(String[] args){

        for (int dia = 1; dia <=3; dia = dia+1){
            System.out.println("Comienzo dia: " + dia);
            for (int hora = 1; hora <=24; hora = hora+1){
                System.out.println("Hora: " + hora + " del dia: " + dia);
                int fila = 1;
                int columna = 1;
                float rayo = (float) Math.random();
                float averia = (float) Math.random();

                while (fila < 8){
                    System.out.print(8 - fila);
                    if(rayo <= 0.25){
                        rayo = (int) (rayo * (5 - 1) + 1);
                    }
                    if(averia <= 0.15){
                        averia = (int) (averia * (7 - 1) + 1);
                    }
                        if (averia == fila){
                            while (columna < 6){
                                System.out.print(" [-] ");
                                columna += 1;
                            }
                        }
                        else{
                            while (columna < 6){
                                float ventana = (float) Math.random();
                                float luz = (float) Math.random();
                                if(rayo == columna){
                                    System.out.print(" [T] ");
                                } else if (ventana > 0.7){
                                    System.out.print(" [#] ");
                                } else if (ventana <= 0.7 && luz <= 0.6){
                                    System.out.print(" [O] ");
                                } else {
                                    System.out.print(" [.] ");
                                }
                                columna += 1;
                            }
                        }
                        columna = 1;
                        fila +=1;
                        System.out.println();
                    }
                    System.out.println();
                }
        }
        System.out.println("Fin del programa");
    }
}