public class Intnormous {

    private byte[] intnormousList;
    private boolean isNegative;
    private boolean isPositive;

    public Intnormous () {
        //should return an Intnormous with the value of 0
    }
   
    public Intnormous(String s) {
        int counter = 0;
        s = s.trim();
        
        if (s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
            //System.out.println("NegativeNum");
        } else {
            isNegative = false;
        }
        
        if (s.charAt(0) == '+') {
            isPositive = true;
            s = s.substring(1);
            //System.out.println("PositiveNumber");
        } else {
            isPositive = false;
        }
        
        System.out.println("String: " + s);
        
        this.intnormousList = new byte[s.length()];
        
        int length = this.intnormousList.length;
        
        while (counter <= s.length()) {
            this.intnormousList[(length - counter)] = Byte.parseByte(s.substring(s.length() - counter));
            counter ++;
        }
        
        System.out.println("intnormousList: " + this.intnormousList);
    }
    
    public String toString (String s) {
        return "0";
    }
    
    public boolean equals (Object n) {
        return true;
    }
    
    public boolean isGreaterThan (Intnormous n) {
        return true;
    }
    
    public boolean isLessThan (Intnormous n) {
        return true;
    }
    
    public Intnormous plus (Intnormous addend) {
        return new Intnormous();
    }
    
    public Intzilla minus (Intzilla subtrahend) {
        return new Intzilla();
    }
    
    public Intzilla times (Intzilla factor) {
        return new Intzilla();   
    }
    
    public Intzilla div(Intzilla divisor) {
        return new Intzilla();
    }
    
    public Intzilla mod(Intzilla divisor) {
        return new Intzilla();
    }
    

}
