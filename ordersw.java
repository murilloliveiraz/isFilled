public class ordersw {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    public ordersw (boolean filled , double cost , String shippingMetod , String cupon ) {
        if (cost > 24.00) {
            System.out.println("hifh value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMetod;
        couponCode = cupon;
    }

    public void ship (){
        if (isFilled == true) {
            System.out.println("shipping!");
            System.out.println("Shipping cost :"+calculateShipping() );
        } else {
            System.out.println("order not ready");
        }
        // System.out.println(cupon());
    }

    public double calculateShipping(){
       double shippingCost;

       switch (shipping){
        case "Express":
        shippingCost = 1.75;
        break;

        
        case "Regular":
        shippingCost = 0;
        break;

        
        default:
        shippingCost = 0.50;           
       }
       return shippingCost;
    } 

    // public String cupon() {
    //     if (couponCode == "ship50"){
    //         return ("seu cupom é de 0.85");
    //     } else {
    //         return("nao ha cupons");
    //     }
    // }



    public static void main (String [] args){
        order book = new order (true , 9.99 , "Express" , "ship50" );
        System.out.println("PEDIDO N°1"); 
        book.ship();
        System.out.println("=================================");
        System.out.println("PEDIDO N°2");
        order chemistrySet = new order (true , 72.50 , "Regular" , "ship50");
         chemistrySet.ship();
    }
}