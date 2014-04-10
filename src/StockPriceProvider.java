import java.util.Timer;
import java.util.TimerTask;

import MyExceptions.ShareNotExistRun;

public abstract class StockPriceProvider implements StockPriceInfo {	
	
	public final Share[] BOERSE = new Share[3];

	public StockPriceProvider() {
		BOERSE[0] = new Share("MAN", 600);
		BOERSE[1] = new Share("Google", 1200);
		BOERSE[2] = new Share("HS-Augsburg", 645);

	}

	private Share getShare(String akt) {
		for (int i = 0; i < this.BOERSE.length; i++) {
			if (this.BOERSE[i].getName().equals(akt))
				return BOERSE[i];
		}
		throw new ShareNotExistRun();
	}

	public long getKurs(String name) {
		return this.getShare(name).getKurs();
	}

	public String getallShareKurs() {
		String s = "";
		for (int i = 0; i < this.BOERSE.length; i++) {
			String tmp = s + BOERSE[i].toString() + "\n";
			s = tmp;
		}

		return s;
	}
	
	public abstract void updateShareRate(Share share);

	public void updateShareRates() {
		
	}
	
	public void startUpdate(){
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				StockPriceProvider.this.updateShareRates();
			}
		}, 2000, 1000);
	
	}
}
