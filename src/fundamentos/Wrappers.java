package fundamentos;

public class Wrappers {
    public static void main(String[] args) {

        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 10000L;

        System.out.println(b.toString());

        Boolean bo = Boolean.parseBoolean("True");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
    }
}
