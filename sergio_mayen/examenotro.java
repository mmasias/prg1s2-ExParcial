package sergio_mayen;
import java.util.Scanner;

public class examenotro {
    public static void main(String[] args) {
        int[][] miMundo = { // el mundo
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},															
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,2,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,2,1,1},															
            {1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,2,2,2,2,2,1,1},															
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},															
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}																													
            };
        Scanner entrada = new Scanner(System.in);
        // variables
        int miFila, miColum;
        int posFila = 0, posColum = 0;
        int minFila, minColum, maxFila, maxColum;
        boolean jugar = true;

        int posX = 3, posY = 3;
        int minX, minY, maxX, maxY;
        minX = 0;
        minY = 0;
        maxX = miMundo.length - 1;
        maxY = miMundo[0].length - 1;

        //implementacion de gallinas
        int posXgallina=15, posYgallina=5;
        int movGallina; movGallina=0;
        int posXgallina2=13, posYgallina2=8;
        int movGallina2; movGallina2=0;
        int posXgallina3=10, posYgallina3=10;
        int movGallina3; movGallina3=0;

        //implementacion del zorro
        int posXzorro=6, posYzorro=14;
        int movZorro; movZorro=0;

        String inputUsuario;
        // aqui es donde se interpreta el wasd y f para finalizar
        String unMensaje = "Inicia el juego";

        minFila = 3; minColum = 3;
        maxFila = miMundo.length - 1; maxColum = miMundo[0].length - 1;

        do {
            // bordes del mundo
            System.out.print("+");
            for (int i = 0; i <= maxColum; i = i + 1) {
                System.out.print("===");
            }
            System.out.println("+");

            for (miFila = 0; miFila < miMundo.length; miFila = miFila + 1) {
                System.out.print("|");
                for (miColum = 0; miColum < miMundo[miFila].length; miColum = miColum + 1) {

                    //imprenta de personaje
                    if ((posX == miColum) && (posY == miFila)) {
                        System.out.print("|T|");
                    } else if ((miColum==posXgallina) && (miFila==posYgallina)){
                        System.out.print("-1-");
                    } else if ((miColum==posXgallina2) && (miFila==posYgallina2)){
                        System.out.print("-2-");
                    } else if ((miColum==posXgallina3) && (miFila==posYgallina3)){
                        System.out.print("-3-");
                    }else if ((miColum==posXzorro) && (miFila==posYzorro)){
                        System.out.print("*z*");
                    }else {
                            /* Esto es a lo que significa cada cosa en el mapa*/
                            if (miMundo[miFila][miColum] == 0) {
                                System.out.print(" . "); //grama, cesped, hierba
                            } else if (miMundo[miFila][miColum] == 1) {
                                System.out.print("[*]"); //paredes
                            } else if (miMundo[miFila][miColum] == 2) {
                                System.out.print("~~~"); //agua
                            } 
                        
                    }
                } 
                System.out.println("|");
            }//Zona con interaccion con usuario
            System.out.print("+");
            for (int i = 0; i <= maxColum; i = i + 1) {
                System.out.print("===");
            }
            System.out.println("+");
            //mensajes debajo del mapa
            System.out.println("| Moverse: wasd | Finalizar:f");
            System.out.println("estas en la posicion: ["+posX+"],["+posY+"]"); //posicion personaje
            System.out.println("Gallina1: ["+posXgallina+"],["+posYgallina+"]"); //posicion gallina1
            System.out.println("Gallina2: ["+posXgallina2+"],["+posYgallina2+"]"); //posicion gallina2
            System.out.println("Gallina3: ["+posXgallina3+"],["+posYgallina3+"]"); //posicion gallina3
            System.out.println("Zorro: ["+posXzorro+"],["+posYzorro+"]"); //posicion zorro
            System.out.println(unMensaje);
            inputUsuario= entrada.nextLine();

            if (inputUsuario.equals("w")&& (posY>minFila) && (miMundo[posY-1][posX]%2==0)) {posY=posY-1; unMensaje="Vas al norte";}
            if (inputUsuario.equals("s")&& (posY<maxFila) && (miMundo[posY+1][posX]%2==0)) {posY=posY+1; unMensaje="Vas al sur";}
            if (inputUsuario.equals("a")&& (posX>minColum) && (miMundo[posY][posX-1]%2==0)) {posX=posX-1; unMensaje="Vas al oeste";}
            if (inputUsuario.equals("d")&& (posX<maxColum) && (miMundo[posY][posX+1]%2==0)) {posX=posX+1; unMensaje="Vas al este";}
            if (inputUsuario.equals("f")) {jugar=false; unMensaje="Se termino el juego";}

            //movimiento gallina1
            movGallina= (int) (Math.random()*4); 
            if ((movGallina==0) && (posYgallina>minFila) && (miMundo[posYgallina-1][posXgallina]!=1)) {posYgallina=posYgallina-1;}
            if ((movGallina==1) && (posYgallina<maxFila) && (miMundo[posYgallina+1][posXgallina]!=1)) {posYgallina=posYgallina+1;}
            if ((movGallina==2) && (posXgallina>minColum) && (miMundo[posYgallina][posXgallina-1]!=1)) {posXgallina=posYgallina-1;}
            if ((movGallina==3) && (posXgallina<maxColum) && (miMundo[posYgallina][posXgallina+1]!=1)) {posXgallina=posYgallina+1;}
            if ((posXgallina==posX) && (posYgallina==posY)){
                {jugar=false; unMensaje="Atrapaste a la gallina";} //Cuando se atrapa a la gallina, se termina 
                /*unMensaje="Atrapaste la gallina"; //desaparece la gallina (no esta completo)
                posXgallina=-1;
                posYgallina=-1;*/
            } 
            //movimiento gallina2
            movGallina2= (int) (Math.random()*4); 
            if ((movGallina2==0) && (posYgallina2>minFila) && (miMundo[posYgallina2-1][posXgallina2]!=1)) {posYgallina2=posYgallina2-1;}
            if ((movGallina2==1) && (posYgallina2<maxFila) && (miMundo[posYgallina2+1][posXgallina2]!=1)) {posYgallina2=posYgallina2+1;}
            if ((movGallina2==2) && (posXgallina2>minColum) && (miMundo[posYgallina2][posXgallina2-1]!=1)) {posXgallina2=posYgallina2-1;}
            if ((movGallina2==3) && (posXgallina2<maxColum) && (miMundo[posYgallina2][posXgallina2+1]!=1)) {posXgallina2=posYgallina2+1;}
            if ((posXgallina2==posX) && (posYgallina2==posY)){
                {jugar=false; unMensaje="Atrapaste a la gallina";} //Cuando se atrapa a la gallina, se termina     
            } 
            //movimiento gallina3
            movGallina3= (int) (Math.random()*4); 
            if ((movGallina3==0) && (posYgallina3>minFila) && (miMundo[posYgallina3-1][posXgallina3]!=1)) {posYgallina3=posYgallina3-1;}
            if ((movGallina3==1) && (posYgallina3<maxFila) && (miMundo[posYgallina3+1][posXgallina3]!=1)) {posYgallina3=posYgallina3+1;}
            if ((movGallina3==2) && (posXgallina3>minColum) && (miMundo[posYgallina3][posXgallina3-1]!=1)) {posXgallina3=posYgallina3-1;}
            if ((movGallina3==3) && (posXgallina3<maxColum) && (miMundo[posYgallina3][posXgallina3+1]!=1)) {posXgallina3=posYgallina3+1;}
            if ((posXgallina3==posX) && (posYgallina3==posY)){
                {jugar=false; unMensaje="Atrapaste a la gallina";} //Cuando se atrapa a la gallina, se termina     
            } 
         //movimiento zorro
         movGallina= (int) (Math.random()*4); 
         if ((movZorro==0) && (posYzorro>minFila) && (miMundo[posYzorro-1][posXzorro]!=1)) {posYzorro=posYzorro-1;}
         if ((movZorro==1) && (posYzorro<maxFila) && (miMundo[posYzorro+1][posXzorro]!=1)) {posYzorro=posYzorro+1;}
         if ((movZorro==2) && (posXzorro>minColum) && (miMundo[posYzorro][posXzorro-1]!=1)) {posXzorro=posYzorro-1;}
         if ((movZorro==3) && (posXzorro<maxColum) && (miMundo[posYzorro][posXzorro+1]!=1)) {posXzorro=posYzorro+1;}
         if ((posXzorro==posX) && (posYzorro==posY)){
             {jugar=false; unMensaje="El zorro se comio a la gallina";} //Cuando el zorro come una gallina, se termina 
         }
        } while (jugar);
    }
}