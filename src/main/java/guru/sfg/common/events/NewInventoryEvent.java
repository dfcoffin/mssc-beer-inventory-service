package guru.sfg.common.events;

import lombok.NoArgsConstructor;

/**
 * Created by Donald F. Coffin on 07/26/2019 at 14:52
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
