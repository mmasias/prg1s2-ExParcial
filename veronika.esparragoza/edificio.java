public class edificio{
    
    
    public static void main(String[] args){
        for (int dia = 1; dia <=3; dia = dia+1){
            System.out.println("El dia es: " + dia);

            for (int hora = 1; hora <=24; hora = hora+1){

                float ventana = (float) Math.random();
                float luz = (float) Math.random();
                
                System.out.println("La hora es: " + hora + " del dia " + dia);

                for (int i = 7; i >= 1; i = i-1 ){
                    System.out.print(i);
                    for (int j = 1; j <=5; j = j+1 ){
                        if(ventana <= 0.7){
                            if(luz <= 0.6){
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
        System.out.println();
    }
}
}