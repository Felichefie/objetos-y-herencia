package objetoVehiculo;

public class Main{
    public static void main(String arg[]){
        System.out.println("Principal");
        Terrestre carro1;
        carro1 = new Terrestre();
        System.out.println(carro1.getPosicion().getPosX());
    }
}

class Vehiculo {
    private int noPasajeros;
    private Posicion posicion;

    public Vehiculo (){
        noPasajeros = 2;
    }
    public Vehiculo (int noPasajeros){
        this.noPasajeros = noPasajeros;
        posicion = new Posicion();
    }
    public int getPasajeros(){
        return noPasajeros;
    }
    public Posicion getPosicion(){
        return posicion;
    }
}

class Terrestre extends Vehiculo{
    private int noRuedas;

    public Terrestre (){
        super(3);
        noRuedas = 4;
    }
    public int getNoRuedas(){
        return noRuedas;
    }
}

class Posicion {
    private int x, y;
    
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
