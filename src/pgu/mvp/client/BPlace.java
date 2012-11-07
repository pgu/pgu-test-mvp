package pgu.mvp.client;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class BPlace extends Place {

    @Prefix("!BPlace")
    public static class Tokenizer implements PlaceTokenizer<BPlace> {
        @Override
        public String getToken(final BPlace place) {
            return "";
        }

        @Override
        public BPlace getPlace(final String token) {
            return new BPlace();
        }
    }
}
