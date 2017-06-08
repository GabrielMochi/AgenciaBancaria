package bancoV2; 


import java.time.LocalDate;

public abstract class Conta {
    
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    Correntista correntista;

    public Conta(int numero, double tarifa, Correntista correntista) {
        this.setNumero(numero);
        this.setDataAbertura(LocalDate.now());
        this.setSaldo(0);
        this.setTarifa(tarifa);
        this.setCorrentista(correntista);
        correntista.addConta(this.getInstance());
    }
    
    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        this.setNumero(numero);
        this.setDataAbertura(dataAbertura);
        this.setSaldo(saldo);
        this.setTarifa(tarifa);
        this.setCorrentista(correntista);
        correntista.addConta(this.getInstance());
    }
    
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente! \nSaldo atual: R$" + this.saldo);
        }
    }
    
    public void depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor incorreto! \nO valor do depósito deve ser maior ou igual zero.");
        }
    }
    
    public abstract double calcularTarifa();

    private int getNumero() {
        return this.numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private LocalDate getDataAbertura() {
        return this.dataAbertura;
    }

    private void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    private double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double getTarifa() {
        return this.tarifa;
    }

    private void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    private Correntista getCorrentista() {
        return this.correntista;
    }

    private void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }
    
    public final Conta getInstance() {
        return this;
    }
    
}
