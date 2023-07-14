package week3.day1;

public abstract class A5MultipleLanguages implements A5Testtool,A5AbstractionLanguage  {  //abstractClass (implements iterface)
	
	public void python() {
		System.out.println("python ---->coming from MultipleLanguage(abdtractclass)");
	}
	
	abstract void ruby();    //unimplementation using abstract keyword(modifies)
	
}
