public class Empregado{
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public double calcularSalario(){
        if(tipo == 1 ){
            return salario;
        }
        else if (tipo == 2 ) {
            return salario + comissao * salario;
        }
        else if (tipo == 3) {
            return salario + bonus;
        }
        return 0;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getTipo() {
        return tipo;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}