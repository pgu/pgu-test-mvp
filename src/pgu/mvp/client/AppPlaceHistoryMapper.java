package pgu.mvp.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({APlace.Tokenizer.class, BPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {

}
