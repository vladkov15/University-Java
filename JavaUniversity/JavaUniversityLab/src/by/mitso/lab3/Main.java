package by.mitso.lab3;

public class Main {
	public static void main(String [] args) {
		Film film = new Film("�������� ���",120,2);
		MultFilm multfilm = new MultFilm();
		Musical musical = new Musical("�������� ��� 2",145,3,"���������",2);
		Historical historical = new Historical("�������� ��� 3",145,4,"��� Z",true);
		WritterInfo writterinfo = new WritterInfo();
		writterinfo.Print(film);
		writterinfo.Print(multfilm);
		writterinfo.Print(musical);
		writterinfo.Print(historical);
	}

}
