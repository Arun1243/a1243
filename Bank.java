package day1.learnings;
// 05-10-19 
public class Bank {
                
	public Bank()
	{
		System.out.println("CHECK ME");
	}
	 
		 //float bal = 500;
		 
		 private void deposit() // private means visible only in that class.
		 
		 {
			 //bal = bal + 100;
         System.out.println("DEPOSIT");			 
		 }
		 
		protected void withdraw() // default means visible only within package
		
		{
		Bank b = new Bank();
			//bal = bal - 50;
			System.out.println("WITHDRAW");
		}
		
		public void giveLoan()
		{
			Bank c = new Bank();
			System.out.println("giveLoan");
		}
	
	  public static void main(String args[])
	  
	  { Bank b = new Bank(); 
	 
	  }
	  
	  //b1.deposit(); 
	  //b2.deposit(); 
	  //System.out.println(b2.bal);
	  //System.out.println(b1.bal); }
	 
		 
		 
		 
	 }
	 
	 
	 
	 

