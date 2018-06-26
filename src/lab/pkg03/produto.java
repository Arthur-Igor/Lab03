package lab.pkg03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;

public class produto extends supermercado {

    private String nome;
    private double preco;

    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    private ArrayList<opiniao> opinioes = new ArrayList<>();
    private Scanner leia;

    public void cadastrarOpnioes() {
        leia = new Scanner(System.in);

        System.out.println("Digite a nota do produto (de -2 a 2): \n");
        int nota = leia.nextInt();
        System.out.println("Faça um comentario de até 140 caracteres: \n");
        String comentario = leia.next();
        if (nota < -2 || nota > 2) {
            System.err.println("A nota deve ser maior que -2 e menor que 2 \n");
        } else if (comentario.length() > 140) {
            System.err.println("O comentario ultrapassou a quantidade maxima de caracteres \n");
        } else {
            GregorianCalendar data = new GregorianCalendar();
            Date now = data.getTime();
            opiniao opnioesCadastradas = new opiniao(comentario, nota, this.nome, this.preco, data);
            opinioes.add(opnioesCadastradas);
            System.out.println("Cadastrado! \n");
        }

    }

    public void estrategiaSimples() {
        int mediaF, n, n1, n2;
        n1 = -2;
        n2 = 2;
        String comentarioMais = ("");
        String comentarioMenos = ("");

        mediaF = 0;

        n = opinioes.size();
        if (opinioes.size() > 0) {
            Iterator<opiniao> it;
            it = opinioes.iterator();
            while (it.hasNext()) {
                if (it.next().getNota() > n1) {
                    n1 = it.next().getNota();
                    comentarioMais = it.next().getComentario();
                } else if (it.next().getNota() < n2) {
                    n2 = it.next().getNota();
                    comentarioMenos = it.next().getComentario();
                }

                mediaF = mediaF + it.next().getNota();
            }

            System.err.println("Comentario mais avaliado: " + comentarioMais + "\n Comentario menos avaliado: " + comentarioMenos);
            System.err.println("A media aritrimetrica é: " + mediaF / n);
        } else {
            System.err.println("Não existem opnioes cadastradas");
        }

    }

    public void estrategiaSazonal() {
        int mediaF, n;
        String comentario1 = ("");
        String comentario2 = ("");
        String comentario3 = ("");
        n = opinioes.size();

        if (opinioes.size() > 0) {

            if (opinioes.size() == 1) {
                mediaF = opinioes.get(0).nota;
                System.err.println("A nota NaMosca do produto é: \n" + mediaF);
                System.err.println("Comentario mais cecente: \n" + comentario1);
                return;

            } else if (opinioes.size() == 2) {
                mediaF = (opinioes.get(0).nota + opinioes.get(1).nota) / 2;
                System.err.println("A nota NaMosca do produto é: \n" + mediaF);
                System.err.println("Comentario mais cecente: \n" + comentario1);
                System.err.println("Segundo comentario mais cecente: \n" + comentario2);
                return;

            } else {
                mediaF = (opinioes.get(n - 1).nota + opinioes.get(n - 2).nota + opinioes.get(n - 3).nota) / 3;
                System.err.println("A nota NaMosca do produto é: \n" + mediaF);
                System.err.println("Comentario mais cecente: \n" + comentario1);
                System.err.println("Segundo omentario mais cecente: \n" + comentario2);
                System.err.println("Terceiro comentario mais cecente: \n" + comentario3);
                return;
            }

        }

        System.err.println("Não existem opnioes cadastradas");

    }

    @Override
    public String toString() {
        return "produto{" + "nome=" + nome + ", preco=" + preco + ", opinioes=" + opinioes + ", leia=" + leia + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<opiniao> getOpinioesCadastradas() {
        return opinioes;
    }

    public void setOpinioesCadastradas(ArrayList<opiniao> opinioesCadastradas) {
        this.opinioes = opinioesCadastradas;
    }

    public ArrayList<opiniao> getOpinioes() {
        return opinioes;
    }

    public void setOpinioes(ArrayList<opiniao> opinioes) {
        this.opinioes = opinioes;
    }

}
