public class pyEdificio {
    public static void main(String[] args) {

        double rayo_columna = 0;
        boolean dia_nuevo = true;

        for (int hora = 1; hora <= 72; hora = hora + 1) {
            double dia = hora/24;
            if (hora % 24 == 0) {
                dia_nuevo = true;
                rayo_columna = 0;
                System.out.println("Es un dia nuevo!");

            }
            System.out.println("Dia [" + (dia + 1) + "]");
            System.out.println("Hora [" + hora + "]");

            double prob_rayo = Math.random(); //Probabilidad de rayo
            if (prob_rayo <= 0.25 && dia_nuevo == true){
                dia_nuevo = false;
                rayo_columna = (int) (Math.random() * (5 - 1) + 1);
                System.out.println("<Ha caido un rayo en la columna [" + rayo_columna +"]>");
            }

            for (int y_espacio = 1; y_espacio <=7; y_espacio = y_espacio + 1){
                System.out.print(y_espacio);

                for (int x_espacio = 1; x_espacio <=5; x_espacio = x_espacio + 1){
                    double estado_ventana = Math.random();
                    if (x_espacio == rayo_columna){
                        System.out.print(" [Z]");
                    } else {
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
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}