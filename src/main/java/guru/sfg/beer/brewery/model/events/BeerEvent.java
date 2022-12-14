package guru.sfg.beer.brewery.model.events;

import guru.sfg.beer.brewery.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {
    static final long serialVersionUID = 4140743008218702270L;
    private BeerDto beerDto;

}
