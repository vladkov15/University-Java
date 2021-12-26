package by.mitso.lab3_2;

public class MultFilm_Toy extends MultFilm {
	private String material;
public MultFilm_Toy() {
	super();
	material="unknown";
}
public MultFilm_Toy(String painter,String name,String material) {
	super(painter,name);
	this.material=material;
	}
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
public void Name() {
		System.out.print(" название="+name);
	}
	@Override
public void Print() {
		System.out.print(" художник="+painter+" название="+name+" материал кукол="+material);	
	}
	
	

}
