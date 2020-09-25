package trueQuestion.tenth;

public class E {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(gcd(14,21));
	}

	static int gcd(int a,int b){
		if(b==0) return a;
		else return gcd(b,a%b);
	}
}
