package Teoría;

public class Dvd {
    private float precio;
    public void setPrecio(){
        precio = 5.50f;
    }
    public void setPrecio(float nuevoPrecio){
        precio=nuevoPrecio;
    }

    public float getPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        Dvd dvd = new Dvd();
        dvd.setPrecio();
        System.out.println(dvd.getPrecio());
        dvd.setPrecio(12.4f);
        System.out.println(dvd.getPrecio());
        System.out.println(dvd);
    }
}
