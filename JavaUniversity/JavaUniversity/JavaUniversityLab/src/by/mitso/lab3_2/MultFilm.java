package by.mitso.lab3_2;

public abstract class MultFilm implements Film,Object {
	protected String painter;
	 protected String name;
	 public MultFilm() {
		 setPainter("unknown");
		 setName("unknown");
	 }
	 public MultFilm(String painter,String name) {
		 this.setPainter(painter);
		 this.setName(name);
	 }
	public String getPainter() {
		return painter;
	}
	public void setPainter(String painter) {
		this.painter = painter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Name() {
		
	}//Film
	public void Print() {
		
	}//Object
	

}
