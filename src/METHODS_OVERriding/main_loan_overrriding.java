package METHODS_OVERriding;

public class main_loan_overrriding {
	public static void main (String[]arg) {
		sbi_loan l = new sbi_loan();
		l.loan();
		bank_loan h= new icici_loan();//upcasting in method overridding
		h.loan();
		hfbc g = new hfbc();
		g.loan();
	}

}
