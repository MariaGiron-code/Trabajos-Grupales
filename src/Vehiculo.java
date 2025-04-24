import java.util.Scanner;
public class Vehiculo {
    //Atributos
    String placa;
    double precio;
    String color;
    String marca;

    // Constructor
    public Vehiculo(String placa, double precio, String color, String marca ) {
    this.placa = placa;
    this.precio = precio;
    this.color = color;
    this.marca = marca;
    }
    // Métodos
    public void vehiculoInformacion(){
        System.out.println("\nInformacion del vehiculo");
        System.out.println("Placa: " + placa);
        System.out.println("Precio: " + precio);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
    }
    public void frenar(){
        System.out.println("El vehiculo esta frenando");

    }
}
