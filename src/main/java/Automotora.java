import java.util.ArrayList;
import java.util.Scanner;

public class Automotora {
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
	public static void main(String[] args) {
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		while (opcion != 4) {
			System.out.println("Menú:");
			System.out.println("1. Crear Auto");
			System.out.println("2. Crear Motocicleta");
			System.out.println("3. Ver Vehículos");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea

			switch (opcion) {
				case 1:
					System.out.print("Ingrese la marca del auto: ");
					String marcaAuto = scanner.nextLine();
					System.out.print("Ingrese el modelo del auto: ");
					String modeloAuto = scanner.nextLine();
					Auto auto = new Auto(marcaAuto, modeloAuto);
					listaVehiculos.add(auto);
					break;
				case 2:
					System.out.print("Ingrese la marca de la motocicleta: ");
					String marcaMoto = scanner.nextLine();
					System.out.print("Ingrese el modelo de la motocicleta: ");
					String modeloMoto = scanner.nextLine();
					Motocicleta motocicleta = new Motocicleta(marcaMoto, modeloMoto);
					listaVehiculos.add(motocicleta);
					break;
				case 3:
					System.out.println("Lista de Vehículos:");
					for (Vehiculo vehiculo : listaVehiculos) {
						System.out.println(vehiculo);
					}
					break;
				case 4:
					System.out.println("¡Hasta luego!");
					break;
				default:
					System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
					break;
			}
		}

		scanner.close();
	}
}