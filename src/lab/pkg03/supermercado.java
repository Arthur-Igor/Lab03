package lab.pkg03;

import java.util.ArrayList;
import java.util.Scanner;

public class supermercado {

    private ArrayList<produto> produtosCadastrados = new ArrayList<>();
    private Scanner leia;

    public void cadastrarProdutos() {

        leia = new Scanner(System.in);

        System.out.println("digite o nome do produto: \n");
        String nome = leia.next();
        System.out.println("digite o preço do produto: \n");
        int preco = leia.nextInt();

        produto produtos = new produto(nome, preco);
        produtosCadastrados.add(produtos);
        System.out.println("Cadastrado! \n");

    }

    public ArrayList<produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }

    public void setProdutosCadastrados(ArrayList<produto> produtosCadastrados) {
        this.produtosCadastrados = produtosCadastrados;
    }

    @Override
    public String toString() {
        return "supermercado{" + "produtosCadastrados=" + produtosCadastrados + ", ler=" + leia + '}';
    }

}
