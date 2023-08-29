
public class InterfaceDemoClass implements InterfaceA,InterfaceB {

	@Override
	public int abc(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long abc(int a,int b) {
		return 0;
	} 

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		InterfaceA.super.m1();
	}
	
	

}
