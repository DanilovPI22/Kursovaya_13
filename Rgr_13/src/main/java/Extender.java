import javax.swing.JOptionPane;

public class Extender extends Abstract {

	protected static double promo;
	@Override
	public double abs() {
		MathRgr.p = 0;
		if (MathRgr.text5.getText().equals("�����3") ) {
	    	MathRgr.p = 0.4;
	    }
	if (MathRgr.text5.getText().equals("�����2") ) {
	    	MathRgr.p = 0.3;
	    }
	 if (MathRgr.text5.getText().equals("�����1") ) {
		 MathRgr.p = 0.2;
	   }
	 promo = MathRgr.p;
		return promo;
	 
		
	}

}
