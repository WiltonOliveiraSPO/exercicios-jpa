package modelo.umpraum;

import infra.DAO;

public class NovoClienteAssento02 {
	public static void main(String[] args) {
		
		Assento assento = new Assento ("C01");
		Cliente cliente = new Cliente ("Silmara Almeida Oliveira", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
	}
}
