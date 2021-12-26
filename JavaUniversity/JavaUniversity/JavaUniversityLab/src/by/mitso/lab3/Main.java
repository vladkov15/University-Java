package by.mitso.lab3;

public class Main {
	public static void main(String [] args) {
		Film film = new Film("странный чел",120,2);
		MultFilm multfilm = new MultFilm();
		Musical musical = new Musical("странный чел 2",145,3,"балалайка",2);
		Historical historical = new Historical("странный чел 3",145,4,"Ёра Z",true);
		WritterInfo writterinfo = new WritterInfo();
		writterinfo.Print(film);
		writterinfo.Print(multfilm);
		writterinfo.Print(musical);
		writterinfo.Print(historical);
	}

}
