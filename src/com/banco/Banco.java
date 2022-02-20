package com.banco;

public class Banco {

    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(1111);
        conta1.setDono("Aclecio");
        conta1.abrirConta("CC");
        conta1.depositar(300);
        conta1.sacar(80);
        conta1.situacao();


        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(22222);
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");
        conta2.depositar(500);
        conta2.sacar(100);
        conta2.fecharConta();
        conta2.situacao();




    }
}
