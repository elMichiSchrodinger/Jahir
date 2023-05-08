public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double coordX, double coordY, double lado) {
        super(coordX, coordY);
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        //super.calcularArea();
        System.out.println("Dentro del calculo del area del cuadrado: "+Math.pow(lado,2));
    }
}
