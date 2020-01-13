package guru.sfg.beer.inventory.service.services;

import guru.sfg.brewery.model.BeerOrderDto;

/**
 * Created by Donald F. Coffin on 01/13/2020 at 16:38
 */
public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
