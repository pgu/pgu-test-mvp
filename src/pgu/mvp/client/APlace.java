package pgu.mvp.client;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class APlace extends Place {

    @Prefix("!APlace")
    public static class Tokenizer implements PlaceTokenizer<APlace> {
        @Override
        public String getToken(final APlace place) {
            return "";
        }

        @Override
        public APlace getPlace(final String token) {
            return new APlace();
        }
    }
}
