package Interface;
interface Hotel{
	public void dining();
	public void buffer();
	/* we also create nested interface. It is helpful for together related methods.
       */
     interface Banquet{
		public void weddingDecortion();
		public void partyDecortion();
		}
}
class AshokaHotel implements Hotel{
@Override
public void dining() {
		System.out.println("This is dinning method");
}
@Override
	public void buffer() {
		System.out.println("This is buffer method .");
}
}
class SunAndSand implements Hotel.Banquet
{////It is very important syntax 
@Override
	public void weddingDecortion() {
		// TODO Auto-generated method stub
		System.out.println("This is wedding Decortion method");
	}

	@Override
	public void partyDecortion() {
		// TODO Auto-generated method stub
		System.out.println("This is partyDecortion method");
	}	
}

public class NestedInterfaceDemo {

	public static void main(String[] args) {
		SunAndSand s=new SunAndSand();
		s.weddingDecortion();
		AshokaHotel a=new AshokaHotel();
		a.dining();
		}
}
