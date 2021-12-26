package by.mitso.lab3;

public  class Film {
	protected String director;
	protected int time;
	protected int audit;
	public Film() {
		director="no name";
		time=0;
		audit=0;
	}
	public Film(String director,int time){
		this.director=director;
		this.time=time;
		audit=0;
	}
	public Film(String director,int time,int audit){
		this.director=director;
		this.time=time;
		this.audit=audit;
	}
	public String GetDirector() {
		return director;
	}
	public int GetTime() {
		return time;
	}
	public int GetAudit() {
		return audit;
	}
	public void Name() {
		System.out.println("|–ежиссер="+director+"|  продолжительность в мин="+time+"| аудирори€="+audit);
	};
	
}
