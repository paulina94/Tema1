package hello.models;

public class Student extends Persoana
  
  {
	  
	  String Facultate,Grupa;
	  
	  
     //declar constructorul si folosesc"super"pentru a marca atributele mostenite din clasa parinte//
	  
	public Student(int idul,String n,String fac,String grup)
	
	{
		
		super(idul,n);
		this.Facultate=fac;
		this.Grupa=grup;
   }
	
	
	
	public String getFacultate()
	{
		return this.Facultate;
	}
	
	public String getGrupa()
    {
    
      return this.Grupa;
	}
    
	
	public void setFacultate(String fac)
	
	{
		this.Facultate=fac;
		
	}
	
	
	public void setGrupa(String grup)
	
	{
		this.Grupa=grup;
	}
	
	
  }