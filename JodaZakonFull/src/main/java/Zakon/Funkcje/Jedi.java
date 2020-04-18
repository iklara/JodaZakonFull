package Gui;

public class Jedi {

	private String name;
	private int moc;
	private String stronaMocy;
	private String kolorMiecza;
	private int id_Zakonu;

	public Jedi(String name, int moc, String stronaMocy, String kolorMiecza, int id_Zakonu) {
		super();
		this.name = name;
		this.moc = moc;
		this.stronaMocy = stronaMocy;
		this.kolorMiecza = kolorMiecza;
		this.id_Zakonu = id_Zakonu;
	}

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}

	public String getStronaMocy() {
		return stronaMocy;
	}

	public void setStronaMocy(String stronaMocy) {
		this.stronaMocy = stronaMocy;
	}

	public String getKolorMiecza() {
		return kolorMiecza;
	}

	public void setKolorMiecza(String kolorMiecza) {
		this.kolorMiecza = kolorMiecza;
	}

	public int getId_Zakonu() {
		return id_Zakonu;
	}

	public void setId_Zakonu(int id_Zakonu) {
		this.id_Zakonu = id_Zakonu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Jedi [name=" + name + ", moc=" + moc + ", stronaMocy=" + stronaMocy + ", kolorMiecza=" + kolorMiecza
				+ ", id_Zakonu=" + id_Zakonu + "]";
	}
}