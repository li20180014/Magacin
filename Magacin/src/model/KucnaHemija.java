package model;

import java.util.Date;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(rokTrajanja);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(rokTrajanja, other.rokTrajanja);
	}

	@Override
	public String toString() {
		return super.toString() + "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}
	
	
}
