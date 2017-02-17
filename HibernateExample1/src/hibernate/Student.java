package hibernate;

public class Student {
private int ID,AGE;
private String NAME;

public int getId(){
	return ID;
}

public void setId(int ID){
	this.ID=ID;
	
}

public String getName() {  
    return NAME;  
}  
public void setName(String NAME) {  
    this.NAME = NAME;  
}  
public int getAge() {  
    return AGE;  
}  
public void setAge(int AGE) {  
    this.AGE = AGE;  
}
}
