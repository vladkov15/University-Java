package by.mitso.lab3;

public class MultFilm extends Film {
 private String painter;
 private String style;
 
 public MultFilm() {
	 super();
	 painter="no name";
	 style="unknown";
 }
 
 public MultFilm(String director,int time,int audit) {
	 super(director,time,audit);
	 painter="no name";
	 style="unknown";
 }
 
 public MultFilm(String director,int time,int audit,String painter,String style) {
	 super(director,time,audit);
	 this.painter=painter;
	 this.style=style;
 }
 
public String getPainter() {
	return painter;
}

public void setPainter(String painter) {
	this.painter = painter;
}

public String getStyle() {
	return style;
}

public void setStyle(String style) {
	this.style = style;
}
@Override
public void Name() {
	System.out.println("|Режиссер="+director+"| продолжительность в мин="+time+"| аудирория="+audit+
			"| художник="+painter+"| стиль="+style);
}
}
