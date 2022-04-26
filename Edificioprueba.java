public class Edificioprueba {
    public static void main(String[] args) {

        double ventanabierta;
        double luz;
        int horas = 0;




        

        for (int dias=0; dias<5; dias++) {
            double probabilidad = Math.random ();
            double averia= 0;

            if (probabilidad <= 0.25) {
                averia = ((int) (Math.random () * 5 + 1));
            } 
            while (horas < 25) {
                System.out.println("Horas: " + horas);
                for (int i=1; i<=7; i=i+1) {
                    for (int j=1; j<6; j=j+1) {
                        ventanabierta = Math.random ();
                        luz = Math.random ();
                         if (averia == j) {
                            System.out.print(" A");
                            }
                            else if (ventanabierta >= 0.70 && luz >= 0.60){
                            System.out.print(" O ");
                            } else if (ventanabierta >= 0.30 && luz >= 0.40) {
                            System.out.print(" # ");
                            } else {
                            System.out.print(" . ");
                         
                    }
                    System.out.println();
                }

                }     
                horas = horas + 1;
                System.out.println("dias: " + dias);
                System.out.println();

            } 
            horas = 1;
               
            
           
        } 
       
        
    }
}