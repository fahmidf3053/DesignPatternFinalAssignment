package main;

import java.util.HashMap;

public class SingleTSC {
	private static SingleTSC single_instance = null; 
	  
	Department allocatedDep;
	HashMap<String,String>isBooked = new HashMap<>();
  
    private SingleTSC() 
    { 
       allocatedDep=null;
    } 
  
    public static SingleTSC getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new SingleTSC(); 
  
        return single_instance; 
    }

	public Department getAllocatedDep() {
		return allocatedDep;
	}

	public void setAllocatedDep(Department allocatedDep) {
		this.allocatedDep = allocatedDep;
	}

    
    public boolean isBooked(String date) {
    	return isBooked.containsKey(date);
    }  
   
}
