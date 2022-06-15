package sergio_mayen;
import java.util.Scanner;

public class pacman {

    private static int puntos = 0, poder = 10;

    public static void main(String[] args) {

        int[][] elMapa = {
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6},				
            {0,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0},				
            {0,1,4,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,4,1,0},				
            {0,1,0,1,1,0,1,0,1,3,0,0,3,1,0,1,0,0,1,0,1,0},				
            {0,1,0,1,1,0,0,0,3,0,0,0,0,3,0,0,0,1,1,0,1,0},				
            {0,0,0,0,0,0,1,1,3,0,0,0,0,3,1,1,0,0,1,0,0,0},				
            {0,1,0,1,1,0,1,1,3,3,3,3,3,3,1,1,0,1,1,0,1,0},				
            {0,1,0,1,1,0,0,0,0,0,6,0,0,0,0,0,0,0,1,0,1,0},				
            {0,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,0,0,1,0},				
            {0,1,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,1,0},				
            {0,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0},				
            {6,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6}				
        };

        
        int[] personaje = {0,0};
        do {
			imprimeMundo(elMapa, personaje);
		} while (procesaMovimiento(elMapa, personaje));
    }

    

    private static void limpiaPantalla() {
		System.out.print("\033[H\033[2J");
        System.out.flush();
		System.out.println("\u2324\u2324");
	}

    private static void imprimeBordeHorizontal(int laLongitud) {

		System.out.print("+");
		for (int x = 0; x < laLongitud; x++) {
			System.out.print("---");
		}
		System.out.println("+");
	}

	private static void imprimeBordeVertical(boolean esBordeDerecho) {

		System.out.print("|");
		if (esBordeDerecho) {
			System.out.println();
		}

	}

    private static void imprimePersonaje() {

		System.out.print(INICIO + WHITE + BLACK_BACKGROUND + " :)" + RESET);

	}
    
    private static void imprimeElemento(int elementoDelMapa) {

		String[] matrizDeElementos = {
				INICIO + YELLOW_BOLD + BLACK_BACKGROUND + " 0 " + RESET,
				INICIO + WHITE + WHITE_BACKGROUND + "[#]" + RESET,
                INICIO + BLACK + BLACK_BACKGROUND + "   " + RESET,
				INICIO + BLUE_BOLD + BLUE_BACKGROUND + "~ ~" + RESET,
                INICIO + PURPLE + PURPLE_BACKGROUND + "!T!" + RESET,
                INICIO + PURPLE + PURPLE_BACKGROUND + "  " + RESET,
                INICIO + YELLOW_BOLD + BLACK_BACKGROUND + " @ " + RESET
		};
		System.out.print(matrizDeElementos[elementoDelMapa]);
	}
    private static void imprimeMundo(int[][] elMapa, int[] elPersonaje) {

		limpiaPantalla();
		imprimeBordeHorizontal(elMapa[0].length);

		for (int y = 0; y < elMapa.length; y++) {
			imprimeBordeVertical(false);
			for (int x = 0; x < elMapa[y].length; x++) {
                if (x == elPersonaje[0] && y == elPersonaje[1]) {
                    imprimePersonaje();
                } else {
                        imprimeElemento(elMapa[y][x]);
                }
			}
			imprimeBordeVertical(true);
		}
		imprimeBordeHorizontal(elMapa[0].length);
		imprimeStatus(elPersonaje);
	}
    private static boolean procesaMovimiento(int[][] elMapa, int[] elPersonaje) {

		Scanner entrada = new Scanner(System.in);
		String inputUsuario;
		char laDireccion=' ';

		inputUsuario = entrada.nextLine();

		if (inputUsuario.equals("f")) {return false;} else
		if (inputUsuario.equals("w")) {laDireccion='N';} else
		if (inputUsuario.equals("a")) {laDireccion='O';} else
		if (inputUsuario.equals("s")) {laDireccion='S';} else
		if (inputUsuario.equals("d")) {laDireccion='E';} 

		mueve(elPersonaje, elMapa, laDireccion);
		return true;
	}

	private static void mueve(int[] unPersonaje, int[][] unMapa, char unaDireccion ){
		int elPersonajeX, elPersonajeY;
		elPersonajeX = unPersonaje[0];
		elPersonajeY = unPersonaje[1];

		if (unaDireccion=='O') {
			if (elPersonajeX == 0) { elPersonajeX = unMapa[0].length - 1; } 
			else if  (unMapa[elPersonajeY][elPersonajeX - 1] % 2 == 0) { elPersonajeX = elPersonajeX - 1; }
		} else if (unaDireccion=='N') {
			if (elPersonajeY == 0) {elPersonajeY = unMapa.length - 1;} 
			else if  (unMapa[elPersonajeY - 1][elPersonajeX] % 2 == 0) { elPersonajeY = elPersonajeY - 1; }
		} else if (unaDireccion=='E') {
			if (elPersonajeX == unMapa[0].length - 1) { elPersonajeX = 0;} 
			else if  (unMapa[elPersonajeY][elPersonajeX + 1] % 2 == 0) { elPersonajeX = elPersonajeX + 1; }
		} else if (unaDireccion=='S') {
			if (elPersonajeY == unMapa.length - 1) { elPersonajeY = 0;} 
			else if  (unMapa[elPersonajeY + 1][elPersonajeX] % 2 == 0) { elPersonajeY = elPersonajeY + 1; }
		} 

		unPersonaje[0] = elPersonajeX;
		unPersonaje[1] = elPersonajeY;
        
        registraPuntos(unPersonaje, unMapa);
        teletransporte(unPersonaje, unMapa);
        poder(unPersonaje, unMapa);
	}

    private static void teletransporte(int[] personaje, int[][] unMapa){
        int opcion = 0;
        int elPersonajeX, elPersonajeY;
        elPersonajeX = personaje[0];
		elPersonajeY = personaje[1];

        Scanner pedir = new Scanner(System.in);
		if(unMapa[personaje[1]][personaje[0]] == 4){
            System.out.print("Seleccione a que teletransportador quieres ir (1 al 4)");
            opcion = pedir.nextInt();
        }
        switch(opcion){
            case 1:
                elPersonajeX = 2;
                elPersonajeY = 2;
                break;
            case 2:
                elPersonajeX = 2;
                elPersonajeY = 9;
                break;
            case 3:
                elPersonajeX = 19;
                elPersonajeY = 2;
                break;
            case 4:
                elPersonajeX = 19;
                elPersonajeY = 9;
                break;
            default:
                System.out.println("No coincide");
        }

        personaje[0] = elPersonajeX;
		personaje[1] = elPersonajeY;
	}

    private static void poder(int[] personaje, int[][] unMapa){
        if(unMapa[personaje[1]][personaje[0]] == 6){
            System.out.println("Se te acaba de brindar tu poder en 10 turnos");
            unMapa[personaje[1]][personaje[0]] = 2;
            for (int i = 0; i < poder; i--) {
                System.out.println("Se te acabo tu poder");
            }
        }
    }

    private static void registraPuntos(int[] personaje, int[][] unMapa){
        if(unMapa[personaje[1]][personaje[0]] == 0){
            unMapa[personaje[1]][personaje[0]] = 2;
            puntos++;
        }
    }

    private static void imprimeStatus(int[] elPersonaje) {

		System.out.println("El personaje está en X:[" + elPersonaje[0] + "] Y:[" + elPersonaje[1] + "]");
		System.out.println("Tienes [ "+ puntos +" ] puntos");

    }

    private static String INICIO = "\033[";
	private static String RESET = "\033[0m";

	private static String BLACK = "0;30";
	private static String RED = "0;31";
	private static String GREEN = "0;32";
	private static String YELLOW = "0;33";
	private static String BLUE = "0;34";
	private static String PURPLE = "0;35";
	private static String CYAN = "0;36";
	private static String WHITE = "0;37";

	private static String BLACK_BOLD = "1;30";
	private static String RED_BOLD = "1;31";
	private static String GREEN_BOLD = "1;32";
	private static String YELLOW_BOLD = "1;33";
	private static String BLUE_BOLD = "1;34";
	private static String PURPLE_BOLD = "1;35";
	private static String CYAN_BOLD = "1;36";
	private static String WHITE_BOLD = "1;37";

	private static String BLACK_BACKGROUND = ";40m";
	private static String RED_BACKGROUND = ";41m";
	private static String GREEN_BACKGROUND = ";42m";
	private static String YELLOW_BACKGROUND = ";43m";
	private static String BLUE_BACKGROUND = ";44m";
	private static String PURPLE_BACKGROUND = ";45m";
	private static String CYAN_BACKGROUND = ";46m";
	private static String WHITE_BACKGROUND = ";47m";

}