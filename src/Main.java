public class Main {
    public static void main(String[] args) {
         // Crear Objetos
        Vehiculo vehiculo1 = new Vehiculo("AER-323",1000,"Blanco","Nissan");
        Vehiculo vehiculo2 = new Vehiculo("PMB-231,", 1200,"Azul","Munstang");
        Vehiculo vehiculo3 = new Vehiculo("IBF-432",1928,"Verde","Chrevolet");

        // Mostrar información
        vehiculo1.vehiculoInformacion();
        vehiculo1.vehiculoInformacion();
        vehiculo2.vehiculoInformacion();
        vehiculo3.vehiculoInformacion();

        // Mostrar estado del frenado
        vehiculo1.frenar();
        vehiculo2.frenar();
        vehiculo3.frenar();
    }
    }

