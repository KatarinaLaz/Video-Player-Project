package p14_9_2021_zadatak4;

public class AudioControl extends Control {


//	Zadatak 3
//	
//	Kreirati klasu AudioControl koja nasledjuje klasu Control i 
//	gettere, settere i konstruktore
//	ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//	implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
	
	private boolean jePovecanZvuk;
	
	
	
	public AudioControl(boolean jePovecanZvuk) {
		super();
		this.jePovecanZvuk = jePovecanZvuk;
	}



	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		if (jePovecanZvuk == true && player.jacinaZvuka < 100) {
			player.jacinaZvuka = player.jacinaZvuka + 1;
		} else if (jePovecanZvuk == true && player.jacinaZvuka == 100) {
			player.jacinaZvuka = 100;
		} else if (jePovecanZvuk == false && player.jacinaZvuka > 0) {
			player.jacinaZvuka = player.jacinaZvuka - 1;
		} else {
			player.jacinaZvuka = 0;
		}
		
	}

//	GETTERS & SETTERS

	public boolean isJePovecanZvuk() {
		return jePovecanZvuk;
	}



	public void setJePovecanZvuk(boolean jePovecanZvuk) {
		this.jePovecanZvuk = jePovecanZvuk;
	}
	
	
	
	
	
	
	
	
}
