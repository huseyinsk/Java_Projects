package HomeWorks;

public interface IOwner {
	
	public abstract void acquire();
	public abstract void dispose();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}}

class Person implements IOwner{
	private String real;
	private String tangible;
	private String intangible;
	
	public String getReal() {
		return real;}

	public void setReal(String real) {
		this.real = real;}

	public String getTangible() {
		return tangible;}

	public void setTangible(String tangible) {
		this.tangible = tangible;}

	public String getIntangible() {
		return intangible;}

	public void setIntangible(String intengible) {
		this.intangible = intengible;}
	
	public void acquire(){System.out.println("Alınan mallar hakkında");}  // set ve get ile işlemler yapılabilir veri tutulabilir gibi
	public void dispose(){System.out.println("Satılan mallar hakkında");} // set ve get ile işlemler yapılabilir veri tutulabilir gibi
}


class Corporation implements IOwner{
	private String current;
	private String fixed;
	private String longTerm;
	private String intangible;

	public String getCurrent() {
		return current;}

	public void setCurrent(String current) {
		this.current = current;}

	public String getFixed() {
		return fixed;}

	public void setFixed(String fixed) {
		this.fixed = fixed;}

	public String getLongTerm() {
		return longTerm;}

	public void setLongTerm(String longTerm) {
		this.longTerm = longTerm;}

	public String getIntangible() {
		return intangible;}

	public void setIntangible(String intangible) {
		this.intangible = intangible;}

	public void acquire(){System.out.println("Alınan mallar hakkında");}  // set ve get ile işlemler yapılabilir veri tutulabilir gibi
	public void dispose(){System.out.println("Satılan mallar hakkında");} // set ve get ile işlemler yapılabilir veri tutulabilir gibi
}









