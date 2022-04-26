public class examen{
    public static void main(String[] args){

        int ventana, ventanaCerrada, ventanaAbierta;
        int luz, luzApagada, luzEncendida;
        int hora;

        hora=0;

        while(hora<=72){
            hora=hora+1;

        ventana=(Math.random()*100-0)+0;
        if(ventana<=70){
            ventana=ventanaAbierta;
        }else{
            ventana=ventanaCerrada;
        }

        luz=(Math.random()*100-0)+0;
        if(luz<=60){
            luz=luzEncendida;
        }else{
            luz=luzApagada;
        }

        for(int i=0;i<=6;i++){

        if((ventana=ventanaAbierta && luz=luzEncendida)==i){
            System.out.print("[0]");
        }else if((entana=ventanaCerrada)==i){
            System.out.print("[#]");
        }else if((ventana=ventanaAbierta && luz=luzApagada)==i){
            System.out.print("[.]");
        }
    
        }

   
        }
    }
}