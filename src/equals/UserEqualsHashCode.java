package equals;

import java.util.Objects;

public class UserEqualsHashCode {
    private String firstName;
    private String lastName;

    public UserEqualsHashCode(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override // Comparando as propriedades
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserEqualsHashCode that = (UserEqualsHashCode) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override // Gerando o hashcode baseado no firstName e lastName
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
