package singleton;

public class MioSingelton {
	
	private static MioSingelton istanza=null;
	
	private MioSingelton() {
		System.out.println("Singelton istanziato con hascode "+hashCode());
	}
	
	public static synchronized MioSingelton getIstance() {
		if(istanza==null) {
			istanza=new MioSingelton();
		}
		return istanza;
	}

}
