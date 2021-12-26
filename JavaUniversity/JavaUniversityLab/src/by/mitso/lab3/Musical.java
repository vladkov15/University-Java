package by.mitso.lab3;

public class Musical extends Film{
	 private String musical_instrumental;
	 private int nuber_of_song;
	 
	 public Musical() {
		 super();
		 musical_instrumental="no name";
		 nuber_of_song=0;
	 }
	 
	 public Musical(String director,int time,int audit) {
		 super(director,time,audit);
		 musical_instrumental="no name";
		 nuber_of_song=0;
	 }
	 
	 public Musical(String director,int time,int audit,String musical_instrumental,int nuber_of_song) {
		 super(director,time,audit);
		 this.musical_instrumental=musical_instrumental;
		 this.nuber_of_song=nuber_of_song;
	 }
	 
	public String getmusical_instrumental() {
		return musical_instrumental;
	}

	public void setmusical_instrumental(String musical_instrumental) {
		this.musical_instrumental = musical_instrumental;
	}

	public int getnuber_of_song() {
		return nuber_of_song;
	}

	public void setnuber_of_song(int nuber_of_song) {
		this.nuber_of_song = nuber_of_song;
	}
	@Override
	public void Name() {
		System.out.println("|Режиссер="+director+"| продолжительность в мин="+time+"| аудирория="+audit+
				"| название инструмента="+musical_instrumental+"| кол-во песен="+nuber_of_song);

	}
}
