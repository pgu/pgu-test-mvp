package pgu.mvp.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class LeftActivityMapper implements ActivityMapper {

    private final ClientFactory clientFactory;

    public LeftActivityMapper(final ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(final Place place) {
        if (place instanceof APlace) {
            return new ALeftActivity((APlace) place, clientFactory);

        } else if (place instanceof BPlace) {
            return new BLeftActivity((BPlace) place, clientFactory);
        }

        return null;
    }

}
