package arrays_collections;

public class EqualsUserTest {

    public static void main(String[] args) {
        EqualsUser u1 = new EqualsUser();
        u1.nome = "Hirrua";
        u1.email = "hirruas@gmail.com";

        EqualsUser u2 = new EqualsUser();
        u2.nome = "Hirrua";
        u2.email = "hirruas@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }

}
