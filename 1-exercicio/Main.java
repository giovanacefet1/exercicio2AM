import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Pessoa dadosPessoa = new Pessoa();
        String nomeDaPessoa;
        int nascimentoDaPessoa;
        float alturaDaPessoa;
        nomeDaPessoa = ler.next();
        dadosPessoa.setNome(nomeDaPessoa);
        nascimentoDaPessoa= ler.nextInt();
        dadosPessoa.setNascimento(nascimentoDaPessoa);
        alturaDaPessoa = ler.nextFloat();
        dadosPessoa.setAltura(alturaDaPessoa);
        dadosPessoa.Impressao();
        dadosPessoa.Idade();        
        
    }
}

