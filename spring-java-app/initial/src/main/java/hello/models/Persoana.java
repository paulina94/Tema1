package hello.models;

import java.util.List;
import java.util.ArrayList;

public class Persoana {
 
 private int Id;
 private String Name;

  public Persoana() {}

  public Persoana(int id, String name) {
      this.Id=id;
      this.Name=name;
      
  }

  public int getId(){
  return this.Id;
	  
  }
 
  
  public String getName(){
  return  this.Name;
  
  }
  
  public void setId(int idul)
  {
	  this.Id=idul;
  }
  
  public void setName(String name){
  this.Name=name;
  }
}
  
  //Extind din clasa Persoana clasa Student care-i mosteneste atributele si adauga unele noi,cum sunt//
   //String Facultate,Grupa//
  
  
  
	