package Ex2;
import java.util.Scanner;
public class UsaPessoa {
    public UsaPessoa() {
    }
    public static void main(String args[])
    {
        String n;
        String g;
        int i;
        Scanner nn= new Scanner(System.in);
        System.out.println("Nome:");
        n=nn.next();

        Scanner gg= new Scanner(System.in);
        System.out.println("Genero:");
        g=gg.next();

        Scanner ii=new Scanner(System.in);
        System.out.println("Idade:");
        i =ii.nextInt();

        Pessoa pessoa1;
        pessoa1 = new Pessoa();
        pessoa1.setNome(n);
        pessoa1.setGenero(g);
        pessoa1.setIdade(i);
        System.out.println(
                "O objeto pessoa1 chama-se " + pessoa1.getNome() + ", é do sexo " + pessoa1.getGenero() + ", tem " + pessoa1.getIdade() + " anos e diz: ");
        pessoa1.falar();
    }
}