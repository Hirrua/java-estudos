package arrays_collections;

import java.util.Objects;

public class EqualsUser {
    String nome;
    String email;

    public boolean equals(Object obj) {

        if (obj instanceof EqualsUser other) {
            boolean nomeIgual = Objects.equals(other.nome, this.nome);
            boolean emailIgual = Objects.equals(other.email, this.email);
            return  nomeIgual && emailIgual;
        }
        return false;
    }
}
