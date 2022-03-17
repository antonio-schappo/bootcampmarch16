package Cliente;


import java.util.ArrayList;

public class Cliente {
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    public static int ids = 1;
    private String nome;
    private String sobrenome;
    private int id;

    public Cliente (String nome, String sobrenome) {
        this.id = ids;
        this.nome = nome;
        this.sobrenome = sobrenome;
        ids++;
    }

    public static void addClientToList (Cliente cliente) {
        listaClientes.add(cliente);
    }

    public static void deleteClient (Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

}
