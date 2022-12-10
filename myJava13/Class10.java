package chap13;

// class CCircleException extends Exception 
// {
// }

class RadiusIsNegative extends Exception
{ 
}
class RadiusTooLarge extends Exception
{ 
}


class CCircle       
{
   private double radius;
   public void setRadius(double r) throws RadiusIsNegative, RadiusTooLarge
   {
      if(r<0)
      {
        throw new RadiusIsNegative();    
      }
      else if(r>100)
      {
        throw new RadiusTooLarge();    
      }
      else
         radius=r;
   }

   public void show()
   {
      System.out.println("area="+3.14*radius*radius);
   }
}

public class Class10 {
    
    public static void main(String[] args) {
        
        CCircle cir=new CCircle();
        try
        {
            cir.setRadius(-1.0);
        }
        catch(RadiusIsNegative e1)    
        {
            System.out.println(e1+" throwed");
        }
        catch(RadiusTooLarge e2)    
        {
            System.out.println(e2+" throwed");
        }
        cir.show();
    }
}
