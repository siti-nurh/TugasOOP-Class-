public class Mobil extends Kendaraan{

	@Override
	public String getjenis(){
	return jenis = "Xenia";
}
	@Override
	public String getbahanbakar(){
	return bahanbakar = "pertamax";
}
public static void main(String args[]){
	Motor m = new Motor();
	Mobil mb = new Mobil();
	Kendaraan k = new Kendaraan();
	m.getjenis();
	System.out.println(m.jenis);
	mb.getjenis();
	System.out.println(mb.jenis);
	k.getbahanbakar();
	System.out.println(k.bahanbakar);
}
	}