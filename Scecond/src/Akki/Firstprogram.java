package Akki;

public class Firstprogram extends Thread {
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		Thread.sleep(500);
		}catch(InterruptedException e){
		        System.out.println(e);
		        
		      }  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
			 Firstprogram t1=new Firstprogram();  
		  t1.start();  
		   

		}}  
			
		
		
