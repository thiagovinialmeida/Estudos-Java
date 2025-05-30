package Domain;

public class Departamento {
    private String Nome;

    public Departamento(String Nome){
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
