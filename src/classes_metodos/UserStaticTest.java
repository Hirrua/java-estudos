package classes_metodos;

public class UserStaticTest {
    public static void main(String[] args) {
        var userA = new UserStatic("Mimi", "Mumu");
        var userB = new UserStatic("João", "jao");

        userA.setCount(1);
        userA.setCount(1);
        System.out.println("Valor do count userA: " + userA.getCount());

        userB.setCount(2);
        userB.setCount(2);
        System.out.println("Valor do count userB: " + userB.getCount());

        // Para acessar o STATIC, quem deve realizar a chamada é a classe
        UserStatic.setCount_class(6);
        UserStatic.setCount_class(6);
        System.out.printf("\nCount da classe\nuserA: %d\nuserB: %d", userA.getCount_class(), userB.getCount_class());
    }
}
