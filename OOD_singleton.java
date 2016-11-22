public class OOD_singleton{
	private static OOD_singleton _instance = null;
	
	protected OOD_singleton(){

	}

	public static OOD_singleton getInstance(){
		if(_instance == null){
			_instance = new OOD_singleton();
		}
	}
}