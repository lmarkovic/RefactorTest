public class RefactorTest {

	//REFACTOR Long Parameter List
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	//REFACTOR Long Parameter List
    private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {
		try {
			System.out.println("Testing");
		} //REFACTOR Catch and rethrow
    catch(Exception e) {
			
		}
		
		try {
			System.out.println("Testing2");
		} //REFACTOR Catch and rethrow
    catch(Exception e) {
			throw e;
		}
	}
}