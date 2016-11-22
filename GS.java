class GetSet{
	private int data;

	public GetSet(){
		
	}

	public GetSet(int d){
		data = d;
	}

	public int getData(){
		return this.data;
	}

	public void setData(int d){
		this.data = d;
	}
}
	
public class GS{
	public static void main(String[] args){
		GetSet gs = new GetSet();
		gs.setData(100);
		System.out.println(gs.getData());
	}
}