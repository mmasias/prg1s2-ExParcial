public class pyEdificio {
    public static void main(String[] args) {

        for (int hora = 1; hora <= 72; hora = hora + 1) {
            //System.out.println("Dia [" + ((int) hora/24) + 1 + "]");
            System.out.println("Hora [" + hora + "]");

            for (int y_espacio = 1; y_espacio <=7; y_espacio = y_espacio + 1){
                System.out.print(y_espacio);

                for (int x_espacio = 1; x_espacio <=5; x_espacio = x_espacio + 1){
                    double estado_ventana = Math.random();
                    if (estado_ventana <= 0.30) {
                        System.out.print(" [#]"); //Ventana cerrada
                    } else {
                        double estado_luz = Math.random();
                        if (estado_luz <= 0.40) {
                            System.out.print(" [.]"); //Ventana abierta, luz apagada
                        } else {
                            System.out.print(" [O]"); //Ventana abierta, luz encendida
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}