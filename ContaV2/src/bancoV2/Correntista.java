package bancoV2;

import java.util.List;

public final class Correntista {
    
    private int codigo;
    private String nome;
    private List<Conta> contas;

    public Correntista(int codigo, String nome, List<Conta> contas) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setContas(contas);
    }
    
    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
}
