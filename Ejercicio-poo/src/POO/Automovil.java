package POO;

public class Automovil {

	
		//atributos o caracteristicas
		
		String marca;
		int    modelo;
		int    precio;
		boolean estado = false;
		
		//definicion de contructor
		
		public Automovil() {
			
			System.out.println("Se creo un objeto de tipo automovil");
		}
		
		
		//metodos o acciones
		
		public void encender() {
		
				if (estado ==true) {
					System.out.println("el auto esta encendio");
				}else {
					
					System.out.println("el auto se encendio");
					estado = true;
				}
				
		}
		
		public void apagar() {
		
			if (estado == true) {
				System.out.println("El auto se apago");	
				estado=false;
				
			}else {
				System.out.println("El auto esta apagado");
			}
		}
		
		public void avanzar() {
			if(estado ==true) {
				System.out.println("El automovil avanza");

			}else {
				System.out.println("El auto no puede avazar apagado");
			}
		}
		
		
		
	}
	


