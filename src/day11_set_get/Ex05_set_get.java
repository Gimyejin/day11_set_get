package day11_set_get;

public class Ex05_set_get {
	private int k;
	private int e;
	private int m;
	private int sum;
	private double avg;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public void setSum() {
		this.sum = getK() + getM() + getE();

	}

	public int getSum() {
		return sum;
	}

	public void setAvg() {
		this.avg = sum / 3.0;
	}

	public double getAvg() {
		this.avg = getSum() / 3;
		return avg;
	}

	public void print() {
		System.out.println("��: " + k);
		System.out.println("��: " + e);
		System.out.println("��: " + m);
		System.out.println("��: " + sum);
		System.out.println("���: " + avg);
	}

}
