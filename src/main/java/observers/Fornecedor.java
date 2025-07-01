package observers;

import subjects.Email;

import java.util.Objects;

public class Fornecedor implements Observer{

    private String nome;
    private String email;

    public Fornecedor (String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedor that = (Fornecedor) o;
        return Objects.equals(nome, that.nome) && Objects.equals(email, that.email);
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
