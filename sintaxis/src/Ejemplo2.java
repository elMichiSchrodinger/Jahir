import javax.print.DocFlavor;

public class Ejemplo2 {
    public static void main(String[] args) {
        //demoStringBuffer();

        insertarEnStringBuffer();

    }

    private static void insertarEnStringBuffer() {
        StringBuffer sb= new StringBuffer();
        sb.append("FIIS UNI - POO");
        sb.insert(9,"clase de ");
        System.out.println(sb);
    }

    private static void demoStringBuffer() {
        StringBuffer sb = new StringBuffer();
        sb.append("Uni Fiis");
        sb.append(" : ");
        System.out.println(sb);
    }
}
