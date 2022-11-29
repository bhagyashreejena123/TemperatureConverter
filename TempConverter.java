public  class TempConverter{
    public  static void main(String[] args) {
        
        for (int i = 0; i < args.length; i++)
        {

        String a = args[0];
        String b = args[2];
        double c  = Integer.parseInt(args[1]);
        
        if (args[0].equals ("c") && args[2].equals("k") )
        {
            
            double res = c+273.15;
            System.out.print (c+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+res+" "+"Kelvin");
            break;
        }
            
        else if (args[0].equals ("c") && args[2].equals("f") )
        {
            
            double res = (c*1.8)+32;
            System.out.print (c+" "+"Degree"+" "+"Celcius"+" "+"is"+" "+"equal"+" "+"to"+" "+res+" "+"Fahrenheit");
            break;
        }
        
        else if (args[0].equals ("k") && args[2].equals("c") )
        {
            
            double res = c-273.15;
            System.out.print (c+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+res+" "+"Celcius");
            break;
        }
        
        else if (args[0].equals ("k") && args[2].equals("f") )
        {
            
            double res = (c-273.15)*1.8+32;
            System.out.print (c+" "+"Degree"+" "+"Kelvin"+" "+"is"+" "+"equal"+" "+"to"+" "+res+" "+"Fahrenheit");
            break;
        }
        
        else if (args[0].equals("f") && args[2].equals("c") )
        {
            
            double res = (c-32)*1.8;
            System.out.print (c+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+res+" "+"Celcius");
            break;
        }

        else if (args[0].equals("f") && args[2].equals("k") )
        {
            
            double res = (c-32)*1.8+273.15;
            System.out.print (c+" "+"Degree"+" "+"Fahrenheit"+" "+"is"+" "+"equal"+" "+"to"+" "+res+" "+"Kelvin");
            break;
        }
    }
}       
}
