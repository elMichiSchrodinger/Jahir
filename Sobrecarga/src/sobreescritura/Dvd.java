package sobreescritura;

public class Dvd {
    private float precio;
    public void setPrecio(){
        precio=5.50f;
    }
    public void setPrecio(float nuevoPrecio){
        precio = nuevoPrecio;
    }

    public float getPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        Dvd dv1= new Dvd();
        System.out.println("Al inicio");
        System.out.println(dv1.getPrecio());

        dv1.setPrecio();
        System.out.println("sin argumentos");
        System.out.println(dv1.getPrecio());

        dv1.setPrecio(2.5f);
        System.out.println("con argumentos");
        System.out.println(dv1.getPrecio());
    }
}
