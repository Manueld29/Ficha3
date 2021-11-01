package Ex2;

public class Pessoa {
    private String Nome;
    private String Genero;
    private int Idade;

    public void falar(){
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }

    public Pessoa() {}
        public Pessoa(String n, String g){
            this.Nome = n;
            this.Genero = g;
        }
        public Pessoa(String n, String g, int i){
            this(n,g); // usa o construtor anterior
            this.Idade = i; }


}
