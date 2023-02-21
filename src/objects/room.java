package objects;

public class room {
	
	private String name;
	private int anzahl;
	
	public room(String name, int anzahl) {
		this.setAnzahl(anzahl);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
	
	

}
