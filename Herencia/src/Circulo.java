public class Circulo extends Figura{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double coordX, double coordY, double radio) {
        super(coordX, coordY);
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    public void calcularArea(){
        System.out.println("Dentro del calculo del area del circulo: "+Math.PI*Math.pow(radio,2));
    }
}
