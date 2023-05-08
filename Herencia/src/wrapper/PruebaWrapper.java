package wrapper;

public class PruebaWrapper {
    public static void main(String[] args) {
        int iCinco=5;
        Integer inum = new Integer(iCinco);
        System.out.println(iCinco);
        System.out.println(inum);
        System.out.println(inum.doubleValue());
        System.out.println(inum.byteValue());
        int num = inum ;

    }
}
