public class Pessoa {
    private String nome;
    private int nascimento;
    private float altura;


    public void Idade(){
        int idade = 2021-getNascimento();
        System.out.println("Idade: " + idade);
    }
    public int getNascimento(){
        return nascimento;
    }
    public void setNome(String nomePessoa){
        nome = nomePessoa;
    }
    public void Impressao(){
        System.out.println("");
        System.out.println("");
        System.out.println("Nome da pessoa:" + getNome() +  " Ano de nascimento: " + getNascimento() + " Altura: " + getAltura());
    }
    public String getNome(){
        return nome;
    }
    public void setAltura(float alturaPessoa){
        altura = alturaPessoa;
    }
    public float getAltura(){
        return altura;
    }
    public void setNascimento(int nascimentoPessoa){
        nascimento = nascimentoPessoa;
    }


}
