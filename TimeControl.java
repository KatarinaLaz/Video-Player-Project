package p14_9_2021_zadatak4;

public class TimeControl extends Control {


//	Zadatak 4
//	
//	Kreirati klasu TimeControl koja nasledjuje klasu Control i 
//	konstruktore
//	ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//	implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s
//	unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.
	
	private boolean jeUnapred;
	
	public TimeControl(boolean jeUnapred) {
		super();
		this.jeUnapred = jeUnapred;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		if (jeUnapred == true && player.trenutnoVreme + 15 <= player.duzinaVidea) {
			player.trenutnoVreme = player.trenutnoVreme + 15;
		} else if (jeUnapred == false && player.trenutnoVreme - 15 >= 0){
			player.trenutnoVreme = player.trenutnoVreme - 15;
		} else if (jeUnapred == true && player.trenutnoVreme + 15 > player.duzinaVidea) {
			player.trenutnoVreme = player.duzinaVidea;
		} else {
			player.trenutnoVreme = 0;
		}
	}

	public boolean isJeUnapred() {
		return jeUnapred;
	}

	public void setJeUnapred(boolean jeUnapred) {
		this.jeUnapred = jeUnapred;
	}
	
	
	
	
	
	
}
