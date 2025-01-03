package HomeWorks;

public abstract class Employee {
	
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.name= name;
		this.id = id;}
	
	public abstract void calculateSalary();
	public void displayDetails(String name, int id) {
		System.out.println("Çalışanın ismi: "+ name+ " id'si: "+id);}
	
	
	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	public int getId() {
		return id;}

	public void setId(int id) {
		this.id = id;}


	public static void main(String[] args) {
		FullTimeEmployee fte = new FullTimeEmployee(null, 0);
		Freelancer fl = new Freelancer(null, 0);
		fte.setName("Hüseyin");
		fte.setId(15);
		fte.setMonthlySalary(30000);
		fte.displayDetails("Hüseyin", 15);
		fte.calculateSalary();
		
		fl.setName("Ahmet");
		fl.setId(10);
		fl.setHourlyRate(300);
		fl.setHoursWorked(150);
		fl.displayDetails("Ahmet", 10);
		fl.calculateSalary();
	}

}

class FullTimeEmployee extends Employee{
	private int monthlySalary;
	
	public int getMonthlySalary() {
		return monthlySalary;}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;}

	public FullTimeEmployee(String name, int id) {
		super(name, id);}

	@Override
	public void calculateSalary() {
		System.out.println("Aylık maaşı: " + monthlySalary);}}

class Freelancer extends Employee{
	private int hourlyRate;
	private int hoursWorked;
	
	public int getHourlyRate() {
		return hourlyRate;}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;}

	public int getHoursWorked() {
		return hoursWorked;}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;}

	public Freelancer(String name, int id) {
		super(name, id);}

	@Override
	public void calculateSalary() {
		int maas = hourlyRate * hoursWorked;
		System.out.println("Freelancer Maaşınız: "+ maas);}}








