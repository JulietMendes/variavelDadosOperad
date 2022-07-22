package br.com.dio.basecamp;

public class Main {

    public static void main (String[] args){

        int i;
//        int i;
        int I;
//        int 1a; //
        int _1a; // não da erro mas não é uma boa pratica.
        int $aq;


        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // variavel constante
//        j = 15;
        int asrn24678md;
//        int asrn246 78md; // erro pq tem espaço
        int asrn2$4678_md = 10; // não é boa pratica usar $ e _
//        int asrn2$46%78_md = 10 ; // $ % _

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
//        int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
//        final int numeroTentativas = 5; // não da erro mas não é boa pratica
        int QUANTIDADE_OPCOES= 25;
//        int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(QUANTIDADE_OPCOES);
        System.out.println(NUMERO_TENTATIVAS);





    }

}
