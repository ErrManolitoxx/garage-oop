package org.ies.vehicles.components;

import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class VehicleReader {
    private final Scanner scanner;

    public VehicleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicle askVehicle() {
        System.out.println("Introduzca los datos del coche: ");

        System.out.println("De qué tipo es su vehículo: ");
        String type = scanner.nextLine();

        System.out.println("¿Cuál es la velocidad máxima que alcanza su vehículo?");
        int maxVelocdad = scanner.nextInt();

        System.out.println("De qué color es su coche?");
        String color = scanner.nextLine();

        System.out.println("Introduzca la matrícula:");
        String matricula = scanner.nextLine();
    }

}
