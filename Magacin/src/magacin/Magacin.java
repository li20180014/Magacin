package magacin;

import java.util.LinkedList;
import java.util.List;

import model.Artikal;

public class Magacin implements MagacinInterfejs {

	public List<Artikal> artikli= new LinkedList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		artikli.add(0, artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
