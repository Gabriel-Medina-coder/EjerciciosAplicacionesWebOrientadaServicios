public class Vehiculo {
    String modelo;
    double nivelCombustible;
    double capacidadMaxima;
    double porcentajeOptimo;
    double porcentajeMaximo;

    public Vehiculo(double capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }

    public void tanquear(double litros, int cantidadCargas){

        porcentajeOptimo = (90*capacidadMaxima)/100;
        porcentajeMaximo = (50*capacidadMaxima)/100;

        if (litros<=(nivelCombustible+=litros)&&cantidadCargas<1){
            nivelCombustible+=litros;
            System.out.println("Cantidad de combustible: " + nivelCombustible);
            cantidadCargas++;
        }else {
            System.out.println("No puedes cargar más del 50% de la capacidad en una sola carga.");
        }
    }
}
