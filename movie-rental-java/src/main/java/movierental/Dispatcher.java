package movierental;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Dispatcher {

    Vector interceptors_;

//    public void registerInterceptor(Interceptor interceptor){
//        interceptors_.add(interceptor);
//    }

    private List<Interceptor> interceptorList = new ArrayList<>();

    public void registerInterceptor(Interceptor interceptor){
        interceptorList.add(interceptor);
    }

    public void deleteInterceptor(Interceptor interceptor){
        interceptorList.remove(interceptor);
    }

    public void callback(Context context){
        for (Interceptor interceptor : interceptorList){
            interceptor.reducedCost(context);
        }

//        for (Interceptor interceptor : interceptors_) {
//            interceptor.reducedCost(context);
//
//        }
    }
}

