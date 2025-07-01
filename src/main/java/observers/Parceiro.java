package observers;

import subjects.Email;

import java.util.Objects;

public class Parceiro implements Observer{

    private String nome;
    private String email;

    public Parceiro (String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parceiro parceiro = (Parceiro) o;
        return Objects.equals(nome, parceiro.nome) && Objects.equals(email, parceiro.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    @Override
    public void update(String mensagem) {
        Email.enviarEmail(this, mensagem);
    }
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public String getEmail () {
        return this.email;
    }
}
