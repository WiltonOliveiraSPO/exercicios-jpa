package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		Produto produto = new Produto("Caderno 1 matéria", 4.50);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		//dao.abrirT().incluir(produto).fecharT().fechar();
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("ID: " + produto.getId());
		System.out.println("Nome do produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getPreco());
	}
}
