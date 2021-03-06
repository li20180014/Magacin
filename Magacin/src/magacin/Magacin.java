package magacin;

import java.util.LinkedList;
import java.util.List;

import model.Artikal;

public class Magacin implements MagacinInterfejs {
	
	
	public List<Artikal> artikli= new LinkedList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		if (artikal!=null) {
			artikli.add(artikal);	
		}
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		artikli.remove(artikal);	
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for (Artikal artikal : artikli) {
			if (artikal.getSifra()==sifra) {
				return artikal;
			}
		}
		
		return null;
	}

}
