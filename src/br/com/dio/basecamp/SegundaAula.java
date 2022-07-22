package br.com.dio.basecamp;

public class SegundaAula {

      public static void main(String[] args) {
          byte b1 = 10;
          byte b2 = 20;

          short s1 = 20000;
    //    short s2 = 40000; // ultrapassando o tamanho

    //    int i1 = -10000000000; // limite inferior
          int i2 = 28500; // valor valido

          long l1 = 1000000000000000000L;
          long l2 = 2004005000500055000L;

   //     float f1 = 4.5; // aula de conversão
          float f2 = 10.68f;

          double d1 = 85.69;
          double d2 = 99.84d;

          char c1 = 'W';
      //    char c2 = 'Tw'; // apenas um caracter
          char c3 = '\u0057'; // o mesmo que a linha 24

          String st1 = "Juliet";
          String st2 = "Tamires";
          String st3 = "O amor suporta todas as coisas, o amor nunca falha!";

      //    String dt1 = "21/07/2022";

          boolean bo1 = true;
          boolean bo2 = false;


          System.out.println(b1);
          System.out.println(b2);
          System.out.println(s1);
          System.out.println(i2);
          System.out.println(b1);
          System.out.println(l1);
          System.out.println(l2);
          System.out.println(d1);
          System.out.println(d2);
          System.out.println(c1);
          System.out.println(c3);
          System.out.println(st1);
          System.out.println(st2);
          System.out.println(st3);
          System.out.println(bo1);
          System.out.println(bo2);

      }
}
