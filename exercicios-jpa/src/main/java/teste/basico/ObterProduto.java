package teste.basico;

import java.util.List;

import modelo.basico.Produto;

public class ObterProduto {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + ", Nome: "
					+ produto.getNome() + ", Preço: " + produto.getPreco());
		}
		
		//somatório dos produtos
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0,  (t,p) -> t+p)
				.doubleValue();
		
		System.out.println("Valor total: R$" + precoTotal);
		
		dao.fechar();
	}
}
