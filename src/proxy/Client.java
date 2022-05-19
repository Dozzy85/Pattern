package proxy;

import java.lang.reflect.Proxy;

public class Client {

	/*// Simple Proxy

	private Subject subject;

	public static void main(String[] args) {
		new Client().invoke();
	}

	void invoke() {
		subject = new MyProxy();
		subject.stampa();
	}

	// Dinamic Proxy
	private Subject subject;

	public static void main(String[] args) throws Exception {
		new Client().invoke();
	}

	public void invoke() {
		subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] { Subject.class },
				new MyDynamicProxy());
		subject.stampa();
	}

	// Virtual Proxy
	public static void main(String[] args) {
		new DocumentManager("/shared/text.txt", "/shared/image.png");
	}

	// Protection Proxy
	public static void main(String[] args) {
		ContoCorrente contoCorrente = new ProxyIntesaSanPaolo("pippo", "pluto");
		System.out.println("login errato: " + contoCorrente.listaMovimenti("0123456789"));

		contoCorrente = new ProxyIntesaSanPaolo("pippo", "pippo");
		System.out.println("login corretto: " + contoCorrente.listaMovimenti("0123456789"));
	}*/

}
