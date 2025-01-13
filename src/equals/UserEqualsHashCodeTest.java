package equals;

public class UserEqualsHashCodeTest {

    public static void main(String[] args) {
        var userA = new UserEqualsHashCode("Mimi", "Mumu"); // Posso utilizar VAR para simplificar e tem a mesma função
        UserEqualsHashCode userB = new UserEqualsHashCode("Mimi", "Mumu");

        // O equals() compara os hash dos objetos exemplo: userA: 45679 é diferente de userB: 568956
        // Para comparar baseado nas propriedades que foi cirado (nome e sobrenome), é preciso sobrescrever esses metódos

        System.out.println(userA);
        System.out.println(userA.hashCode());

        System.out.println(userB);
        System.out.println(userB.hashCode());

        System.out.println(userA.equals(userB));
    }
}
