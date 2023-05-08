public class Triangulo extends Figura{
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        //super.calcularArea();
        System.out.println("Dentro del calculo del area del triangulo: "+base*altura/2);

    }

    public Triangulo(double coordX, double coordY, double base, double altura) {
        super(coordX, coordY);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
