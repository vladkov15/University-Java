package by.mitso.lab3_2;

public class History implements Film,Object{
	private String name;
	private String author;
	
	public History() {
		name="unknown";
		author="author";
	}
	public History(String name,String author) {
		this.name=name;
		this.author=author;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public void Print() {
		System.out.print(" название="+name+" автор="+author);
		
	}
	@Override
	public void Name() {
	System.out.print(" название="+name);
		
	}

}

