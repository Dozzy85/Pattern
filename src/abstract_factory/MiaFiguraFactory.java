package abstract_factory;

public class MiaFiguraFactory extends FiguraFactory{
	
	 public Figura createCerchio() {
		 return new MioCerchio();
	}
	 public Figura createRettangolo() {
		 return new MioRettangolo();
	}

}
