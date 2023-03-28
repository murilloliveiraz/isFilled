public class order {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    public order (boolean filled , double cost , String shippingMetod , String cupon ) {
        if (cost > 24.00) {
            System.out.println("hifh value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMetod;
        cupon = couponCode;
    }

    public void ship (){
        if (isFilled == true) {
            System.out.println("shipping!");
            System.out.println("Shipping cost :"+calculateShipping() );
        } else {
            System.out.println("order not ready");
        }
    }

    public double calculateShipping(){
        if (shipping == "Regular"){
            return (0);
        } else if (shipping == "Express") {
            if (shipping == "Express" && couponCode == "ship50")  {   
            return(0.85);
            } else {
                return(1.75);
            } 
        }   else {
            return (0.50);
        }
    } 


    public static void main (String [] args){
        order book = new order (true , 9.99 , "Express" , "ship50" );
        System.out.println("PEDIDO N°1"); 
        book.ship();
        System.out.println("=================================");
        System.out.println("PEDIDO N°2");
        order chemistrySet = new order (true , 72.50 , "Express" , "ship50");
         chemistrySet.ship();
    }
}