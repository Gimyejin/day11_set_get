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
		System.out.println("국: " + k);
		System.out.println("영: " + e);
		System.out.println("수: " + m);
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
	}

}
