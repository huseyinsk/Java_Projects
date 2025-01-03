package HomeWorks;

public interface ICalisan {
	public abstract void calis();
	
	public static void main(String[] args) {
		Mudur mudur = new Mudur();
		Programci programci = new Programci();
		Pazarlamaci pazarlamaci = new Pazarlamaci();
		GenelMudur genelMudur = new GenelMudur();
		AnalizProgramci analizProgramci = new AnalizProgramci();
		
		System.out.println("--- Müdür için ---");
		mudur.calis();
		System.out.println("--- Programcı için ---");
		programci.calis();
		System.out.println("--- Pazarlamacı için ---");
		pazarlamaci.calis();
		System.out.println("--- GenelMüdür için ---");
		genelMudur.calis();
		genelMudur.toplantiYonet();
		System.out.println("--- AnalizProgramcı için ---");
		analizProgramci.calis();
		analizProgramci.analizYap();}}


class Mudur implements ICalisan{
	public void calis() {
		System.out.println("Müdür çalışıyor");}
}

class Programci implements ICalisan{
	public void calis() {
		System.out.println("Programci çalışıyor");}
}

class Pazarlamaci implements ICalisan{
	public void calis() {
		System.out.println("Pazarlamacı çalışıyor");}
}

class GenelMudur implements ICalisan{
	public void calis() {
		System.out.println("GenelMudur çalışıyor");}
	public void toplantiYonet() {
		System.out.println("Toplantı yönetiliyor");}
}

class AnalizProgramci implements ICalisan{
	public void calis() {
		System.out.println("AnalizProgramci çalışıyor");}
	public void analizYap() {
		System.out.println("Analiz yapılıyor.");}
}



