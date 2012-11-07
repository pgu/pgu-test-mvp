package pgu.mvp.client;

import pgu.mvp.client.ui.ALeftView;
import pgu.mvp.client.ui.ARightView;
import pgu.mvp.client.ui.AppView;
import pgu.mvp.client.ui.BLeftView;
import pgu.mvp.client.ui.BRightView;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public interface ClientFactory {

    EventBus getEventBus();

    PlaceController getPlaceController();

    ALeftView getALeftView();
    BLeftView getBLeftView();

    ARightView getARightView();
    BRightView getBRightView();

    AppView getAppView();

}
