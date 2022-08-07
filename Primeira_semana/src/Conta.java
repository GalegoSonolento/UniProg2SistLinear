public class Conta {
    private double saldo;
    private String numero;
    private String nome;

    public Conta(String nome) {
        this.nome = nome;
    }

    public void depositar(double a){
        saldo += a;
    }

    public void sacar(double a){
        saldo -= a;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
