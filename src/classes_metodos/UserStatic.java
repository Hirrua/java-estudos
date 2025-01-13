package classes_metodos;

public class UserStatic {
    private String firstName;
    private String lastName;

    private int count = 0; // Contador do objeto
    private static int count_class = 0; // Contador que pertence a classe, logo todos obj instânciado recebem o valor dele

    public UserStatic(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public static void setCount_class(int c) {
        count_class = count_class + c; // Como pertence a classe não é realizado o uso do THIS.
    }

    public int getCount_class() {
        return count_class;
    }

    public void setCount(int c) {
        this.count = this.count + c; // Como pertence o objeto "vivo", é necessário o THIS.
    }

    public int getCount() {
        return count;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
