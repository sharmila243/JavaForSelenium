package OOPS_AC_WebDriver_Arch;

public class SafariDriver implements WebDriver {
	
	public SafariDriver() {
		System.out.println("Launch a Safari browser");
	}

	
	@Override
	public void click() {
		System.out.println("Click on element");
	}

	@Override
	public void sendkeys() {
		System.out.println("Seding value to element");
	}

	@Override
	public void quit() {
		System.out.println("Quit element");
	}

	@Override
	public void findElement(String element) {
		System.out.println("find element" + element);
	}


}
