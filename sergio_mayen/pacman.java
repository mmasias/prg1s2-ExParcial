package sergio_mayen;
import java.util.Scanner;

public class pacman {
    private static int posicionX, posicionY, opcion;
    public static void main(String[] args){
        int[][] unMapa = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},				
            {0,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0},				
            {0,1,2,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,2,1,0},				
            {0,1,0,1,1,0,1,0,1,3,0,0,3,1,0,1,0,0,1,0,1,0},				
            {0,1,0,1,1,0,0,0,3,0,0,0,0,3,0,0,0,1,1,0,1,0},				
            {0,0,0,0,0,0,1,1,3,0,0,0,0,3,1,1,0,0,1,0,0,0},				
            {0,1,0,1,1,0,1,1,3,3,3,3,3,3,1,1,0,1,1,0,1,0},				
            {0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0},				
            {0,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,0,0,1,0},				
            {0,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1,0},				
            {0,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0},				
            {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
			};

            posicionX=0;
            posicionY=0;

		do {
			imprimeMapa(unMapa);
		} while (procesaMovimiento(unMapa));
	}

	private static boolean procesaMovimiento(int[][] elMapa){

		Scanner entrada = new Scanner(System.in);
		String inputUsuario;
		
		inputUsuario = entrada.nextLine();
		
		if (inputUsuario.equals("a") && elMapa[posicionY][posicionX-1]%2==0) {posicionX=posicionX-1;} else 
		if (inputUsuario.equals("d") && elMapa[posicionY][posicionX+1]%2==0) {posicionX=posicionX+1;} else 
		if (inputUsuario.equals("w") && elMapa[posicionY-1][posicionX]%2==0) {posicionY=posicionY-1;} else 
		if (inputUsuario.equals("s") && elMapa[posicionY+1][posicionX]%2==0) {posicionY=posicionY+1;} else 
		if (inputUsuario.equals("f")) { return false;}

		return true;
	}
	
	private static void imprimePersonaje(){
		System.out.print("\\O/");
	}

	private static void imprimeBordeHorizontal(int laLongitud){

		System.out.print("+");
		for (int j=0;j<laLongitud;j=j+1){
			System.out.print("---");
		}
		System.out.println("+");		
	}

	private static void imprimeBordeVertical(boolean bordeDerecho){
		System.out.print("|");
		if (bordeDerecho) {System.out.println();}
	}
	
	private static void imprimeMapa(int[][] mapaPorImprimir){
		
		imprimeBordeHorizontal(mapaPorImprimir[0].length);
		
		for (int i=0; i<mapaPorImprimir.length; i=i+1){
			imprimeBordeVertical(false);
			for (int j=0; j<mapaPorImprimir[i].length; j=j+1) {
				if (puedoVer(i,j,100)) {
					if (i==posicionY && j==posicionX) {
						imprimePersonaje();
					} else {
						imprimeElemento(mapaPorImprimir[i][j]);
					}
				} else {
					System.out.print("   ");
				}
			}
			imprimeBordeVertical(true);
		}		
		imprimeBordeHorizontal(mapaPorImprimir[0].length);
		
		System.out.println("Personaje en X:["+posicionX+"] Y:["+posicionY+"]");
	}

	private static boolean puedoVer(int i, int j, int alcanceVision) {

		return Math.pow(posicionX-j,2)+Math.pow(posicionY-i,2)<=Math.pow(alcanceVision,2);

	}

	private static void imprimeElemento(int elementoDelMapa) {
		String[] matrizDeElementos = {" . ","[#]", "o.*","~ ~"};

		System.out.print(matrizDeElementos[elementoDelMapa]);
	}

    private static void opcionTeletransporte(){
        switch (opcion){
            case 1:
                posicionX = 3;
                posicionY = 3;
                break;
            case 2:
                posicionX = 9;
                posicionY = 3;
                break;
            case 3:
                posicionX = 3;
                posicionY = 19;
                break;
            case 4:
                posicionX = 9;
                posicionY = 19;
                break;
            default:
                System.out.println("Esa opcion no esta");
        }
    }
    
}

