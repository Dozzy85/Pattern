package singleton;

public class Main {

	public static void main(String[] args) {
		
		MioSingolo s1=MioSingolo.getMioSingolo();
		MioSingolo s2=MioSingolo.getMioSingolo();
		
		MioSingelton s3=MioSingelton.getIstance();
		MioSingelton s4=MioSingelton.getIstance();

	}

}
