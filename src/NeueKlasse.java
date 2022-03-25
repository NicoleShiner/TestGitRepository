import java.util.ArrayList;



public class NeueKlasse {

	private ArrayList<String> schüler;
	private String klasse;
	
	public NeueKlasse(String klasse) {
		setKlasse(klasse);
	}
	
	
	public String toString() {
		
		String out = "–" + this.klasse;
		return out;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
}
