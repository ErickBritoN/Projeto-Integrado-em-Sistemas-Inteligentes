package Detec;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Detector {
    public static void main(String[] args) {
        // Scanner para receber resposta do usuário
        Scanner detector = new Scanner(System.in);
         String nome;
         String autorizacao;
         int idade;
         int local;
         int pergunta1;
         int pergunta2;
         int pergunta3;
         int pergunta4;
         int pergunta5;
         int pergunta6;
         int pergunta7;
         int pergunta8;
         int pergunta9;
         int pergunta10;
         int pergunta11;
         int pergunta12;
         int pergunta13;
         int pergunta14;
         int pergunta15;
         int resultadoPerguntas = 0;


        // Inicio do programa com titulo
        System.out.println("xx====================xx");
        System.out.println("x                      x");
        System.out.println("x DETECTOR DE SUICÍDIO x");
        System.out.println("x                      x");
        System.out.println("xx====================xx");

        // Introdução, 3 perguntas básicas
        System.out.println("Nos diga o seu nome: ");
        nome = detector.next();
        System.out.println("Nos diga a sua idade: ");
        idade = detector.nextInt();
        System.out.println("Você mora na capital ou interior, Sendo (1 = capital e 2 = interior) 1 ou 2 ?");
        local = detector.nextInt();
        

        // Introdução básica com informações e pedido de autorização do usuário
        System.out.println("Seja muito bem vindo ao nosso detector " + nome);

        System.out.println("Logo abaixo temos algumas informações importantes para você, leia com atenção");
        System.out.println("O programa foi feito para identificar pessoas com tendência ao suicídio.");
        System.out.println("No final da utilização do programa, iremos disponibilizar um e-mail para que você possa deixar o seu feedback.");
        System.out.println("Para que possamos começar você precisa ser 100% sincero quanto as nossas perguntas");
        System.out.println("========================================================================================================================");
            // GRANDE QUESTIONARIO DE PERGUNTAS
            System.out.println("Vamos dar inicio ao nosso questionário.");
            //Pergunta1
            System.out.println("você possui alguma doença clínica crônica debilitante ? ");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta1 = detector.nextInt();
            //pergunta2
            System.out.println("Você tem algum tipo de conflitos em torno da identidade sexual ? ");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta2 = detector.nextInt();
            //pergunta3
            System.out.println("No País onde você mora, você é imigrante ou indígena ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta3 = detector.nextInt();
            //pergunta4
            System.out.println("Você teve alguma perda recente (familiar, animal de estimação, amigo(a), etc..) ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta4 = detector.nextInt();
            //pergunta5
            System.out.println("Você possui algum historico familiar de suicídio (Algum familiar que tentou contra sua própria vida) ? ");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta5 = detector.nextInt();
            //pergunta6
            System.out.println("Você é casado(a) com alguém que já se suicídou ou era casado(a) ? ");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta6 = detector.nextInt();
            //pergunta7
            System.out.println("Em sua infância ou adolescência você já sofreu maus tratos, abuso físico e sexual, pais divorciados, transtorno psiquiátrico familiar ? ");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta7 = detector.nextInt();
            //pergunta8
            System.out.println("Você passa por Conflitos familiares ou falta de apoio social ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta8 = detector.nextInt();
            //pergunta9
            System.out.println("Você sente sentimentos de desesperança, desespero, desamparo e impulsividade ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta9 = detector.nextInt();
            //pergunta10
            System.out.println("Você usa algum tipo de droga ilícita ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta10 = detector.nextInt();
            //pergunta11
            System.out.println("Você é divorciado(a), viúvo(a), nunca se casou ou não teve filhos ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta11 = detector.nextInt();
            //pergunta12
            System.out.println("Você está desempregado(a) com problemas financeiros ou é trabalhador(a) não qualificado(a) entre o período de 3 messes ? (muito importante este tempo)");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta12 = detector.nextInt();
            //pergunta13
            System.out.println("Você é aposentado(a) ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta13 = detector.nextInt();
            //pergunta14
            System.out.println("Você é morador de rua ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta14 = detector.nextInt();
            //pergunta15
            System.out.println("Você tem fácil acesso a meios letais ?");
            System.out.println("Digite (1) para sim e (0) para não");
            pergunta15 = detector.nextInt();


            resultadoPerguntas = (pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5 + pergunta6 + pergunta7 + pergunta8 + pergunta9 + pergunta10 + pergunta11 + pergunta12 + pergunta13 + pergunta14 + pergunta15);
        //Ifs para soltar o resultado da pesquisa
        if (resultadoPerguntas == 0) {
            System.out.println("Parabéns, fico feliz por você está tão bem !! você não corre muitos riscos de desenvolver esta doença.");
            System.out.println("Qualquer dúvida, reclamação ou sugestão contate-nos em nosso E-mail que está logo abaixo");
            System.out.println("contato@prevencaoaosuicideo.com");
        }else if (resultadoPerguntas >= 1 || resultadoPerguntas <= 5){
            System.out.println("Você pode estar com um pouco de tendência ao suicídio, por favor, visite um psicólogo");
            System.out.println("Qualquer dúvida, reclamação ou sugestão contate-nos em nosso E-mail que está logo abaixo");
            System.out.println("E lembre-se, você é muito importante para o mundo e todos ao seu redor, Às vezes é inevitável chorar, mas nunca podemos perder a esperança de voltar a sorrir.");
            System.out.println("contato@prevencaoaosuicideo.com");
        }else if (resultadoPerguntas >= 6 || resultadoPerguntas <= 10){
            System.out.println("Você tem MUITA tendência ao suicídio, por favor, visite um psicólogo o mais rápido possível.");
            System.out.println("Qualquer dúvida, reclamação ou sugestão contate-nos em nosso E-mail que está logo abaixo");
            System.out.println("E lembre-se, você é muito importante para o mundo e todos ao seu redor, Às vezes é inevitável chorar, mas nunca podemos perder a esperança de voltar a sorrir.");
            System.out.println("contato@prevencaoaosuicideo.com");
        }else{
            System.out.println("Você precisa de AJUDA urgentemente, por favor busque um psicólogo para desabafar ou até mesmo converse com pessoas proximas, você é importante, vc é especial");
            System.out.println("Não deixe que essa doença te leve, lute com todas as suas forças, busque um psicólogo ainda hoje se possível.");
            System.out.println("Qualquer dúvida, reclamação ou sugestão contate-nos em nosso E-mail que está logo abaixo");
            System.out.println("E lembre-se, você é muito importante para o mundo e todos ao seu redor, Às vezes é inevitável chorar, mas nunca podemos perder a esperança de voltar a sorrir.");
            System.out.println("contato@prevencaoaosuicideo.com");
            detector.close();
        }
    }
}
