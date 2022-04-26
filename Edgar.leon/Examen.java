public class Examen{
    public static void main(String[] args) {
        double abierta = Math.random();
        double cerrada = Math.random();
        int dimension;
        int totalhoras= 72;
        double rayo = Math.random()*horas;

        for (int hora = 1; totalhoras <= horas; hora = hora + 1) {
            System.out.println("Hora [" + hora + " ");

            for (int y = 1; y <=7; y = y + 1){
                System.out.print(y);

                for (int x_espacio = 1; x_espacio <=5; x_espacio = x_espacio + 1){
                    double estado_ventana = Math.random();
                    if (estado_ventana <= 0.30) {
                        System.out.print(" [#]");
                    } else {
                        double estado_luz = Math.random();
                        if (estado_luz <= 0.40) {
                            System.out.print(" [.]");
                        } else {
                            System.out.print(" [O]"); 
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}