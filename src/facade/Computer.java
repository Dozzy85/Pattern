package facade;

public class Computer {
	

	private CPU cpu;
	private Ram ram;
	private Disk disk;

	public Computer() {
		cpu=new CPU();
		ram = new Ram(1024);
		disk=new Disk();
	}

	public void start() {
		cpu.stop();
		ram.load(disk.getBootSector());
		cpu.start();
	}

}
