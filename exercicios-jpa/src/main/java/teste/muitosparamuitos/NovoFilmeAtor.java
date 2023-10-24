package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		
		Filme filmeA = new Filme ("A dama do lotação", 9.7);
		Filme filmeB = new Filme ("Bacurau", 8.9);
		
		Ator atorA = new Ator ("Sônia Braga");
		Ator atorB = new Ator ("Nuno Leal Maia");
		
		filmeA.addAtor(atorA);
		filmeA.addAtor(atorB);
		
		filmeB.addAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		
	}
}
