package by.mitso.lab3;

public class Historical extends Film {
	 private String history_period;
	 private boolean correspondence;
	 
	 public Historical() {
		 super();
		 history_period="no name";
		 correspondence=false;
	 }
	 
	 public Historical(String director,int time,int audit) {
		 super(director,time,audit);
		 history_period="no name";
		 correspondence=false;
	 }
	 
	 public Historical(String director,int time,int audit,String history_period,boolean correspondence) {
		 super(director,time,audit);
		 this.history_period=history_period;
		 this.correspondence=correspondence;
	 }
	 
	public String gethistory_period() {
		return history_period;
	}

	public void sethistory_period(String history_period) {
		this.history_period = history_period;
	}

	public boolean getcorrespondence() {
		return correspondence;
	}

	public void setcorrespondence(boolean correspondence) {
		this.correspondence = correspondence;
	}
	@Override
	public void Name() {
		System.out.println("|Режиссер="+director+"| продолжительность в мин="+time+"| аудирория="+audit+
				"| исторический период="+history_period+"| соответствие периоду="+correspondence);
	}

}
