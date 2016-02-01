package com.training;

public class DisplayClass {

	public void show(Media[] mediaArray){
		
		
		for(Media m: mediaArray){
			if(m instanceof Books){
				Books book = (Books) m;
				m.show();
			}
			else if(m instanceof Periodicals){
				Periodicals periodicals = (Periodicals) m;
				periodicals.show();
			}
			else if (m instanceof DVD){
				DVD dvd = (DVD) m;
				dvd.show();
			}
		}
	}
	
	public void showUserChoice(Media[] mediaArray, Class choice){
		
		for(Media m: mediaArray){
			
			if(m.getClass().equals(choice)){
				
				m.show();
			}
			
		}
	}
}
