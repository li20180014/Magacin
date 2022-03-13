package model;

import java.util.Date;

public class KucnaHemija extends Artikal {
	
	Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) throws Exception {
		if (rokTrajanja.before(new Date())) {
			throw new Exception("Rok trajanja ne moze biti pre danasnjeg datuma!");
		}
		this.rokTrajanja = rokTrajanja;
	}
	
	
}
