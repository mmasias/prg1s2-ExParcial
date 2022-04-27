class EdificioConVentanas {
	public static void main(String[] args) {
		boolean caeRayo;
		int columnaMuerta;
		for(int losDias=1; losDias<=3; losDias++) {
			caeRayo=false;
			columnaMuerta=0;
			for(int lasHoras=0; lasHoras<=23; lasHoras++) {
				if (Math.random()<.5 && !caeRayo) {
					caeRayo=true;
					columnaMuerta = (int) (Math.random()*5+1);
					System.out.println("Cae un rayo");
					}
				System.out.println("DIA "+losDias + " HORA "+lasHoras);
				for (int lasPlantas=1; lasPlantas<=7; lasPlantas++){
					for (int losDomicilios=1; losDomicilios<=5; losDomicilios++) {
						if (caeRayo && losDomicilios==columnaMuerta) {
							System.out.print(" [R] ");
						} else {
							if (Math.random()<=0.7) {
								if (Math.random()<=0.6) {
									System.out.print(" [O] ");
								} else {
									System.out.print(" [.] ");
								}
							} else {
								System.out.print(" [#] ");	
							}							
						}
					}
					System.out.println("");
				}
			}
		}
	}
}