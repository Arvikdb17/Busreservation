package busreservation;

public class bus {
	private int busno;
	private boolean ac;
	private int capacity;
	public bus(int no, boolean ac, int cap) {
		super();
		this.busno = no;
		this.ac = ac;
		this.capacity = cap;
	}
	public int busno() {
		return busno;
	}
	public boolean isac() {
		return ac;
	}
	public int getcapacity() {
		return capacity;
	}
	public void setac(boolean val) {
		ac=val;
	}

	public void setcapacity(int cap) {
		capacity=cap;
	}
	public void displaybusinfo() {
		System.out.println("BusNO: "+busno +" Ac: "+ac +" TotalCapacity: "+ capacity);
	}


}
