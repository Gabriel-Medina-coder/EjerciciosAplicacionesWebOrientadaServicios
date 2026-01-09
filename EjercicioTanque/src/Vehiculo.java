public class Vehiculo {
    String modelo;
    double capacidadMaxima;
    double nivelCombustible;

    double nivelRecomendado;
    double cargaPermitida;

    public Vehiculo(String modelo, double capacidadMaxima, double nivelCombustible){
        this.modelo= modelo;
        this.capacidadMaxima= capacidadMaxima;
        this.nivelCombustible= nivelCombustible;
    }

    public void tanquear(double litros){
        cargaPermitida = capacidadMaxima*0.5;
        nivelRecomendado = capacidadMaxima*0.9;

        double cargaTemporal= litros + nivelCombustible;

        if(litros >capacidadMaxima || cargaTemporal>capacidadMaxima){
            System.out.println("La gasolina se desbordara");
        }else {
            if (litros>cargaPermitida){
                System.out.println("No puedes cargar más de la mitad de la capacidad del tanque en una sola carga");
            }else{
                if (cargaTemporal>nivelRecomendado){
                    System.out.println("Estas sobrepasando el nivel recomendado");
                    nivelCombustible+=litros;
                    System.out.println("Cargada correctamente");
                }else {
                    nivelCombustible+=litros;
                    System.out.println("Cargada correctamente");
                }

            }
        }

        System.out.println("Nivel de gasolina actual: " + nivelCombustible);
    }
}
