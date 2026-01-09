public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("Aventador", 100.00,5.00);

        carro.tanquear(30);
        carro.tanquear(40);
        carro.tanquear(50);
        carro.tanquear(25);
        carro.tanquear(90);
    }
}