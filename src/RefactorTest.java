public class RefactorTest {

	//REFACTOR Long Parameter List
    public static void main(ParameterObjectparameterObject
       ) {
		// TODO Auto-generated method stub
	}
	
	//REFACTOR Long Parameter List
    private void managePerson(String name, String surrName, int age, int id, int id_card, String city, String address) {
		try {
			System.out.println("Testing");
		} //REFACTOR Catch and rethrow
    catch(Exception e) e
              .printStackTrace
               ()
             ;
       {
			
		}
		
		try {
			System.out.println("Testing2");
		} //REFACTOR Catch and rethrow
    catch(Exception e) {
			
		}
	}
}private class ParameterObject {
          String[] args;
        }