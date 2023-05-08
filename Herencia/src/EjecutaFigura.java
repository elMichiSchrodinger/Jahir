import java.lang.reflect.Array;
import java.util.ArrayList;

public class EjecutaFigura {
    public static void main(String[] args) {
        Figura figura=new Figura();
        figura.calcularArea();

        Circulo circulo = new Circulo(2,4,2);
        circulo.calcularArea();

        Cuadrado cuadrado = new Cuadrado(2);
        cuadrado.calcularArea();

        Triangulo triangulo = new Triangulo(3,4);
        triangulo.calcularArea();

        //Triangulo figuraRara =new Circulo(2,0);

        System.out.println("Polimorfismo");
        Figura circulo2=new Circulo(3);
        circulo2.calcularArea();
        Circulo circulo3 = (Circulo) circulo2;
        System.out.println("Radio: "+circulo3.getRadio());

        Figura cuadrado2 = new Cuadrado(2);
        Figura triangulo2 = new Triangulo(3,4);
        /*

        ArrayList<String> list = new ArrayList<>();
        list.add("Inocente");
        list.add("Morales");
        list.add("Rosales");
        list.add("Audante");

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        for (String s:list){
            System.out.println(s);
        }

        */
        ArrayList<Figura> figuras = new ArrayList();
        figuras.add(cuadrado2);
        figuras.add(triangulo2);
        figuras.add(circulo2);
        for(Figura figura2: figuras){
            figura2.calcularArea();
        }
    }
}
