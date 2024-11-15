package org.ies.vehicles.model;

import java.util.Objects;

public class Vehicle {

    private VehicleType vehicleType;
    private int maxVelocidad;
    private String color;
    private String matrícula;

    public Vehicle(VehicleType vehicleType, int maxVelocidad, String color, String matrícula) {
        this.vehicleType = vehicleType;
        this.maxVelocidad = maxVelocidad;
        this.color = color;
        this.matrícula = matrícula;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getMaxVelocidad() {
        return maxVelocidad;
    }

    public void setMaxVelocidad(int maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return maxVelocidad == vehicle.maxVelocidad && vehicleType == vehicle.vehicleType && Objects.equals(color, vehicle.color) && Objects.equals(matrícula, vehicle.matrícula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, maxVelocidad, color, matrícula);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", maxVelocidad=" + maxVelocidad +
                ", color='" + color + '\'' +
                ", matrícula='" + matrícula + '\'' +
                '}';
    }
}
