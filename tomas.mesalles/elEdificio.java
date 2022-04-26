public class elEdificio {
    public static void main(String[] args) {

        double rayo_columna = 0;
        double averia_planta = 0;
        boolean nueva_averia_posible = true;
        boolean nuevo_rayo_posible = true;

        for (int hora = 1; hora <= 72; hora = hora + 1) {
            int dia = (hora - 1)/24;
            if ((hora - 1) % 24 == 0) {
                nuevo_rayo_posible = true;
                nueva_averia_posible = true;
                rayo_columna = 0;
                averia_planta = 0;
                System.out.println("Es un nuevo dia!");

            }
            System.out.println("Dia [" + (dia + 1) + "]");
            System.out.println("Hora [" + hora + "]");

            double prob_rayo = Math.random(); //Probabilidad de rayo
            if (prob_rayo <= 0.25 && nuevo_rayo_posible == true){
                nuevo_rayo_posible = false;
                rayo_columna = (int) (Math.random() * (5 - 1) + 1);
                System.out.println("<Ha caido un rayo en la columna [" + rayo_columna +"]>");
            }

            double prob_averia = Math.random(); //Probabilidad de rayo
            if (prob_averia <= 0.15 && nueva_averia_posible == true){
                nueva_averia_posible = false;
                averia_planta = (int) (Math.random() * (7 - 1) + 1);
                System.out.println("<Ha habido una averia en la planta [" + averia_planta +"]>");
            }

            for (int y_espacio = 7; y_espacio >=1; y_espacio = y_espacio - 1){
                System.out.print(y_espacio);

                for (int x_espacio = 1; x_espacio <=5; x_espacio = x_espacio + 1){
                    double estado_ventana = Math.random();
                    if (x_espacio == rayo_columna || y_espacio == averia_planta){
                        System.out.print(" [Z]"); //Ventana averiada
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