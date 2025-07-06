package Ecomsystem.ExceptionsFile;

public class ExpiredProductException extends Exception{


public ExpiredProductException(){
    super("The Products you need are expired");
}


public ExpiredProductException(String s){
    super(s); 
}

}
