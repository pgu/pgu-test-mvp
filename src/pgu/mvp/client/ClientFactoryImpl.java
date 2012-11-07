package pgu.mvp.client;

import pgu.mvp.client.ui.ALeftView;
import pgu.mvp.client.ui.ARightView;
import pgu.mvp.client.ui.AppView;
import pgu.mvp.client.ui.BLeftView;
import pgu.mvp.client.ui.BRightView;
import pgu.mvp.client.ui.app.AppViewImpl;
import pgu.mvp.client.ui.left.ALeftViewImpl;
import pgu.mvp.client.ui.left.BLeftViewImpl;
import pgu.mvp.client.ui.right.ARightViewImpl;
import pgu.mvp.client.ui.right.BRightViewImpl;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public class ClientFactoryImpl implements ClientFactory {

    private final EventBus eventBus = new SimpleEventBus();

    private final PlaceController placeController = new PlaceController(eventBus);

    private final ALeftView aLeftView = new ALeftViewImpl();

    private final BLeftView bLeftView = new BLeftViewImpl();

    private final ARightView aRightView = new ARightViewImpl();

    private final BRightView bRightView = new BRightViewImpl();

    private final AppView appView = new AppViewImpl();

    @Override
    public EventBus getEventBus() {
        return eventBus;
    }

    @Override
    public PlaceController getPlaceController() {
        return placeController;
    }

    @Override
    public ALeftView getALeftView() {
        return aLeftView;
    }

    @Override
    public BLeftView getBLeftView() {
        return bLeftView;
    }

    @Override
    public ARightView getARightView() {
        return aRightView;
    }

    @Override
    public BRightView getBRightView() {
        return bRightView;
    }

    @Override
    public AppView getAppView() {
        return appView;
    }

}
