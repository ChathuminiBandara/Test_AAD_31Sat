package lk.ijse.aad.test_aad_31sat.foodItems;

import lk.ijse.aad.test_aad_31sat.Anootation.finalPreference;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@finalPreference

public class ChickenRoll {
    //final preference

    public ChickenRoll() {

    }

    public void roll() {
        System.out.println("Mahesh's Final Preference is ChickenRoll");
    }

}
