package ssa;

public class Mainline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account checking = new Account();
		checking.setAccountId(100);
		checking.description = "My personal checking account";
		checking.balance = 500.00;
		System.out.println(checking.print());
		checking.deposit(200);
		System.out.println(checking.print());
		checking.withdrawal(600);
		System.out.println(checking.print());
		checking.deposit(100);
		System.out.println(checking.print());
		checking.withdrawal(300);
		System.out.println(checking.print());
		checking.withdrawal(200);
		System.out.println(checking.print());
		
		System.out.println('\n');
			
		Account savings = new Account();
		savings.setAccountId(200);
		savings.description = "My personal savings account";
		savings.balance = 1000.00;
		System.out.println(savings.print());
		savings.withdrawal(750);
		System.out.println(savings.print());
		savings.withdrawal(250);
		System.out.println(savings.print());
		savings.deposit(200);
		System.out.println(savings.print());
		System.out.println('\n');
		
		savings.toTransfer(checking, 100);
						
		System.out.println('\n');
		System.out.println(checking.print() + '\n' + savings.print());




		
		
		


	}
}
