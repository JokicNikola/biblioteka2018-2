package biblioteka;

import java.util.LinkedList;

import javax.management.RuntimeErrorException;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList <Knjiga> lista  = new LinkedList<Knjiga>();
	
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga==null || lista.contains(knjiga)) System.out.println("Vec postoji");
		else 
			lista.add(knjiga);

	}

	
	public void obrisiKnjigu(Knjiga knjiga) {
		if(knjiga==null || !lista.contains(knjiga)) throw new RuntimeException("Ne postoji");
		else 
			lista.remove(knjiga);

	}

	
	public LinkedList<Knjiga> vratiSveKnjige() {
		
		return lista;
	}

	
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, String isbn, String izdavac) {

		

		if(naslov==null)
			throw new RuntimeException("Morate uneti naslov");
		LinkedList<Knjiga> nova= new LinkedList<Knjiga>();
		for(int i=0; i<lista.size(); i++)
			if(lista.get(i).getNaslov().contains(naslov))
				nova.add(lista.get(i));
		return nova;

	}

}
