package Intermediate.Records;

import java.util.Objects;

public class Ninja {
    private final String name;
    private final String email;
    private final int telefone;

    public Ninja(String name, String email, int telefone) {
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }
    //não teria como add setters pq o setter atribuiria um novo valor como as variaveis é final isso não seria possivel

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return telefone == ninja.telefone && Objects.equals(name, ninja.name) && Objects.equals(email, ninja.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, telefone);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
