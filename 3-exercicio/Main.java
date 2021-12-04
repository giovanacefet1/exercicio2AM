import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        Estacionamento EstacionamentoMain = new Estacionamento();
        int horasEntrada;


        int horasSaida;

        String modeloDoCarro;

        String placaDoCarro;
        modeloDoCarro = ler.nextLine();
        placaDoCarro = ler.nextLine(); 

        horasEntrada = ler.nextInt();

        horasSaida = ler.nextInt();

        EstacionamentoMain.setEntrada(horasEntrada);

        EstacionamentoMain.setSaida(horasSaida);
        EstacionamentoMain.setPlaca(placaDoCarro);

        EstacionamentoMain.setModelo(modeloDoCarro);
        
        EstacionamentoMain.imprimirDados();
        System.out.println(EstacionamentoMain.Valor());
   
    }
}
