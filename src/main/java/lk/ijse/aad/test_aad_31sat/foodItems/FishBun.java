package lk.ijse.aad.test_aad_31sat.foodItems;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishBun {
    //first preference
    public FishBun(){

    }

    public void firstPreference(){
        System.out.println("Mahesh's first Preference is fishbun !");
    }
}
