public class Figura {
    private double coordX;
    private double coordY;

    public Figura(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    public Figura(){

    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public void calcularArea(){
        System.out.println("Dentro del calculo del area general");
    }

    public static void main(String[] args) {
        Figura figura = new Figura(2,5);
        System.out.println(figura.getCoordX());
        System.out.println(figura.getCoordY());
    }
}
