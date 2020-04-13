package _07_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
        if( isWoman == false && isKnighted == true ) {
        	name = "Hello Sir " + name;
        	System.out.println(name);
        }else if(  isWoman == false && isKnighted == false) {
        	name = "Hello Mr. " + name;
        	 System.out.println(name);
        }else if ( isWoman == true && isKnighted == false) {
        	name = "Hello Ms. " + name;
        	System.out.println(name);
        }else if ( isWoman == true && isKnighted == true) {
        	name = "Hello Lady " + name;
        	System.out.println(name);
        
    }
		
        return name;
}
}
