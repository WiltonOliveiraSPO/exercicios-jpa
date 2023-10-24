package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento01 {
	public static void main(String[] args) {
		
		Assento assento = new Assento ("A01");
		Cliente cliente = new Cliente ("Wilton Almeida Oliveira", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(assento)
		.incluir(cliente)
		.fecharT()
		.fechar();
	}
}
