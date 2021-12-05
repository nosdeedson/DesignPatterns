package templateMethodPattern;

import javax.swing.JOptionPane;

public class Coffee extends CafeineBerage {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee in the filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding milk and sugar");
	}
	
	@Override
	public boolean clientWantsCondiments() {
		int result = JOptionPane.showConfirmDialog(null, "Add condment? ", null, JOptionPane.YES_NO_OPTION);
		if ( result == 0) {			
			return true;
		}else {
			return false;
		}
	}

}
