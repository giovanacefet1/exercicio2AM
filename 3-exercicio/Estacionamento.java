public class Estacionamento {
    private String modelo;
    private String placa;
    private int horasentrada;
    private int horassaida;
    public void Inicializar(){
        setSaida(0);
        setEntrada(0);
        setModelo(" ");
        setPlaca(" ");
    }

    public void imprimirDados(){
        System.out.println("\n\nModelo: " + getModelo() + "\nPlaca: " + getPlaca() +"\nHorário da entrada: " + getEntrada()+"\nHorário da saída: " + getSaida());
    }

    public double Valor(){
        int horarioEntrada = getEntrada();
        int horarioSaida = getSaida();
        return ((horarioSaida-horarioEntrada)*1.5);
    }
    public void setSaida(int saidaCarro){
        horassaida = saidaCarro;
    }
    public int getSaida(){
        return horassaida;
    }



    public void setModelo(String modeloCarro){
        modelo = modeloCarro;
    }
    public String getModelo(){
        return modelo;
    }


    public void setPlaca(String placaCarro){
        placa = placaCarro;
    }
    public String getPlaca(){
        return placa;
    }

    public void setEntrada(int entradaCarro){
        horasentrada = entradaCarro;
    }
    public int getEntrada(){
        return horasentrada;
    }
}
