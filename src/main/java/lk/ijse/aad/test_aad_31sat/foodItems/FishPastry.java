package lk.ijse.aad.test_aad_31sat.foodItems;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry {
    //second preference
    public FishPastry(){

    }
    public void secondPreference(){
        System.out.println("Mahesh's Second Preference is FishPastry !");
    }
}
