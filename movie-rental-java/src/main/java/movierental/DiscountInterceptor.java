package movierental;

public class DiscountInterceptor implements Interceptor {

    @Override
    public void reducedCost(Context context) {
        int loyalty = context.getCustomer().getFrequentRenterPoints();
        if (loyalty < 10){
            context.getCustomer().setDiscount(1.0);
        } else if(loyalty < 25){
            context.getCustomer().setDiscount(0.9);
        }else if(loyalty < 50){
            context.getCustomer().setDiscount(0.8);
        } else if(loyalty > 49){
            context.getCustomer().setDiscount(0.75);
        }
    }
}
