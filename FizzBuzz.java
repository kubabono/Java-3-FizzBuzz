package fizzbuzz;

// JAKUB B¥K


public class FizzBuzz {

    private Integer calculateTo;
    private Integer calculateFrom;
    
    public FizzBuzz(Integer calculateFrom, Integer calculateTo) {
        
        if (calculateFrom == null || calculateTo == null ) {
            throw new IllegalArgumentException("values cannot be null");
        }	
                
        if (calculateTo != 100 || calculateFrom !=1) {
            throw new IllegalArgumentException("sorry but we are counting from 1 to 100");
        }
        this.calculateFrom = calculateFrom;
        this.calculateTo = calculateTo;
    	}

    
    public Integer getCalculateTo() {       
        return calculateTo;       
    }
     
    public Integer getCalculateFrom(){    
        return calculateFrom;      
    }
    
    public Integer getCurrentInt(int number) {   
        return number;
    }
    
    public String returnFizz(){
        return "Fizz";    
    }
    
    public String returnBuzz(){
        return "Buzz"; 
    }
    
    public String returnFizzBuzz(){
       return "FizzBuzz";
    }
    
    
    public String getValue(Integer number){       
        StringBuilder sb = new StringBuilder();
        
        if ( (number % 3 == 0) && (number % 5 == 0) ) {
            sb.append(returnFizzBuzz());   
        }
        
        else if (number % 3 == 0) {
            sb.append(returnFizz());     
        }
        
        else if (number % 5 == 0) {
            sb.append(returnBuzz());
        }
        
        else {
            sb.append(String.valueOf(number));
        }
        
        return sb.toString();    
    	}
    
    public void makeFizzBuzz(){
     
        for (int i = calculateFrom; i < calculateTo + 1; i++) {
            System.out.println(getValue(i));
        }
    
	}
}