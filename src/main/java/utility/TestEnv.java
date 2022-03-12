package utility;

public enum TestEnv {
	
	
	
	BASEURL("http://localhost:8084"),
	USERNAME("rmgyantra"),
	PASSWORD("rmgy@9999");

	String label;

	private TestEnv(String label) {
		this.label = label;
	}
	
	public static void main(String[] args) {
		System.out.println(TestEnv.BASEURL.label);
	}
}
