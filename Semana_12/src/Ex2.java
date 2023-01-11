import java.util.Stack;

public class Ex2 {
    public static void main(String[] args){

        System.out.println("Simulação de instaciação de classe: ");
        Stack<Cliente> clienteStack = new Stack<>();
        clienteStack.add(new Cliente("Cliente", "main", 12));
        clienteStack.add(new Cliente("Cliente", "consulta", 39));
        clienteStack.add(new Cliente("Comprador", "pagar", 45));
        for (Cliente c : clienteStack){
            System.out.println(c);
        }
    }
}

class Cliente{
    private final String nome, metodo;
    private final int linhaExec;

    public Cliente(String nome, String metodo, int linhaExec) {
        this.nome = nome;
        this.metodo = metodo;
        this.linhaExec = linhaExec;
    }

    @Override
    public String toString() {
        return nome+"."+metodo+"(): "+linhaExec;
    }
}
