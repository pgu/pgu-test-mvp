package pgu.mvp.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class RightActivityMapper implements ActivityMapper {

    private final ClientFactory clientFactory;

    public RightActivityMapper(final ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(final Place place) {
        if (place instanceof APlace) {
            return new ARightActivity((APlace) place, clientFactory);

        } else if (place instanceof BPlace) {
            return new BRightActivity((BPlace) place, clientFactory);
        }

        return null;
    }

}
