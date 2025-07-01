package observers;

import subjects.Email;

import java.util.Objects;

public class Cliente implements Observer{

    private String nome;
    private String email;

    public Cliente (String nome, String email) {
        this.nome = nome;
        this.email = email;

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(email, cliente.email);
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