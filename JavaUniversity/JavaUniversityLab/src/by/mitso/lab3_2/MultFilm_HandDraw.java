package by.mitso.lab3_2;

public class MultFilm_HandDraw extends MultFilm{
	private String style;
public MultFilm_HandDraw() {
	super();
	style="unknown";
}
public MultFilm_HandDraw(String painter,String name,String style) {
	super(painter,name);
	this.style=style;
}
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	@Override
public void Name() {
		System.out.print(" название="+name+" Стиль рисования"+style);
	}
	@Override
public void Print() {
    System.out.print(" художник="+painter+" название="+name+" Стиль рис.="+style);
	}

}
