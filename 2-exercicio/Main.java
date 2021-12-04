import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Elevador ElevadorMain = new Elevador();
        int capacidadeTotal;
        int AndaresTotal;
        int decidir = 2;
        capacidadeTotal = ler.nextInt();
        AndaresTotal = ler.nextInt();
        ElevadorMain.Inicializa(capacidadeTotal, AndaresTotal);
        while (decidir < 5 && decidir>=1){
            decidir = ler.nextInt();
            switch(decidir){
                case 1:
                    ElevadorMain.Entra();
                case 2:
                    ElevadorMain.Sai();
                case 3:
                    ElevadorMain.Sobe();
                case 4:
                    ElevadorMain.Desce();
            }
        } 
    }
}
