package controlDeFlujo;
public class ControlDeFlujo {//El nombre de la clase debe ser el mismo que el del documento
	
	public static void main(String[] args) {//Este es el método principal dentro del cuál se va a ejecutar todo nuestro código
		
		String citaProgramada = "28-09-2023"; //Asignamos una variable declarada en null donde posterioremente asignaremos una fecha
		
		if (citaProgramada != null) {
			System.out.println("Diculpe, ya tenemos una cita programada para este día");
		} else {
			System.out.println("Se ha registrado exitosamente tu cita");
		}
		
		
		int opcion = 0;
		
		System.out.println("Menú de citas del Diente Feliz");
		System.out.println("1. ¿Desea programar una cita?");
		System.out.println("2. Verificar cita programada");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Salir del menú");
		System.out.println("Seleccione una opción del menú (1-4)");
		
		switch (opcion) {
		case 1:
			System.out.println("¡Programa tu cita!");
			break;
		case 2:
			System.out.println("¡Verifica tu cita!");
			break;
		case 3:
			System.out.println("¿Qué cita deseas cancelar?");
			break;
		case 4:
			System.out.println("Gracias por usar nuestro menú");
			break;
		default:
				System.out.println("Por favor selecciona una opción de nuestro menú");
			break;
		}
		
		
 }
}
