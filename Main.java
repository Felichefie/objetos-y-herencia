package objetoVehiculo;

public class Main{
    public static void main(String arg[]){
        System.out.println("Principal");
        Terrestre carro1;
        carro1 = new Terrestre();
        System.out.println(carro1.posicion.getPosX());
    }
}

class Vehiculo {
    int noPasajeros;
    Posicion posicion;

    public Vehiculo (){
        noPasajeros = 2;
    }
    public Vehiculo (int noPasajeros){
        this.noPasajeros = noPasajeros;
        posicion = new Posicion();
    }
}

class Terrestre extends Vehiculo{
    int noRuedas;

    public Terrestre (){
        super(3);
        noRuedas = 4;
    }
}

class Posicion {
    int x, y;
    
    public Posicion (){
        x = 240;
        y = 320;
    }
    public int getPosX(){
        return x;
    }
    public int getPosY(){
        return y;
    }
}
