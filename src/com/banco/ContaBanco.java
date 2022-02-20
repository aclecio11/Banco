package com.banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void situacao() {
        System.out.println("_____________________________________________________");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("_____________________________________________________");
    }

    //construtor:
    public ContaBanco() {
        //this.setSaldo(0);
        //this.setStatus(false);
        this.saldo = 0;
        this.status = false;
    }
    //Getters and setters:

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            setSaldo(50);
        } else if (t.equals("CP")) {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (getSaldo() < 0) {
            System.out.println("Conta em debito!");
        } else if (getSaldo() > 0){
            System.out.println("Esta conta possui saldo!");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito de "+v+" reais realizado na conta de "+ this.getDono());
        } else{
            System.out.println("Impossivel depositar numa conta fechada!");
        }
    }

    public void sacar(float v) {
        if (getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado da conta de "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente para este saque!");
            }
        }else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }

    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipo().equals("CC")){
            v = 12;
        } else if (getTipo().equals("CP")){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }

    }

}