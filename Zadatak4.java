package p14_9_2021_zadatak4;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {

//		4.Zadatak  (ZA VEZBANJE)
//		
//		Kreirati klasu VideoPlayer koja ima:
//		duzinu videa 
//		trenutno vreme videa
//		jacinu zvuka
//		Kvalitet videa (144, 240, 360, 480, 720, 1080)
//		gettere, settere i konstruktore
//		metodu stampaj koja stampa podatke u formatu:
//		trenutno vreme videa
//		jacina zvuka
//		kavlitet videa
//
//		Kreirati apstraktnu klasu Control koja ima:
//		abstraktnu metodu izvrsi akciju, koja kao parametar prima objekat VideoPlayer
//
//		Kreirati klasu TimeControl koja nasledjuje klasu Control i 
//		konstruktore
//		ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//		implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s
//		unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.
//
//		Kreirati klasu AudioControl koja nasledjuje klasu Control i 
//		gettere, settere i konstruktore
//		ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//		implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100
//
//		Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
//		ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//		gettere, settere i konstruktore
//		implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//		brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//		npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//		npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//		npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
//
//		U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
//
//		U glavnom programu kreirati niz akcija i izvrsiti ih nad istim plejerom.

		VideoPlayer v = new VideoPlayer(120, 40, 75, 144);
		
		ArrayList<Control> kontrole = new ArrayList<Control>();
		
		Control t1 = new TimeControl(true);
		Control t2 = new TimeControl(true);
		Control t3 = new TimeControl(true);
		Control a1 = new AudioControl(false);
		Control a2 = new AudioControl(false);
		Control a3 = new AudioControl(false);
		Control a4 = new AudioControl(false);
		Control a5 = new AudioControl(false);
		Control q = new QualityOptimizerControl(24);
		
		kontrole.add(t1);
		kontrole.add(t2);
		kontrole.add(t3);
		kontrole.add(a1);
		kontrole.add(a2);
		kontrole.add(a3);
		kontrole.add(a4);
		kontrole.add(a5);
		kontrole.add(q);
		
		for (int i = 0; i < kontrole.size(); i++) {
			kontrole.get(i).izvrsiAkciju(v);
		}
		
		v.stampa();
		
		
	}

}
