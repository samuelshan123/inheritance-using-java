
interface Smokable{
	void printItWhatItProducess();
}
interface Dangerious{
	void printDangeriousToHealth();
}
interface NotAllowed{
	void printNotAllowedInPublic();
}
interface leadToCancer{
	void printitcausecancer();
}

class Peedi implements Smokable,Dangerious,NotAllowed,leadToCancer{

	// Name : Theeni peedi
    String name ="Theeni Peedi";
	
	@Override
	public void printNotAllowedInPublic() {
        System.out.println("smoking is Not Allowed in public");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printDangeriousToHealth() {
        System.out.println("smoking is dangerous to health");

		// TODO Auto-generated method stub
		
	}

	@Override
	public void printItWhatItProducess() {
		// TODO Auto-generated method stub
        System.out.println("smoking affects lungs");

	}

	@Override
	public void printitcausecancer() {
        System.out.println("smoking cause cancer");

		// TODO Auto-generated method stub
		
	}
	
}

class Main{
    public static void main(String[] args) {
        
        Peedi p =new Peedi();
        p.printDangeriousToHealth();
        p.printItWhatItProducess();
        p.printNotAllowedInPublic();
        p.printitcausecancer();
    }
}