package pgu.mvp.client;

import pgu.mvp.client.ui.AppView;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.event.shared.EventBus;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Pgu_test_mvp implements EntryPoint, AppPresenter {

    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

    private final Place defaultPlace = new APlace();
    PlaceController placeController;

    @Override
    public void onModuleLoad() {

        final ClientFactory clientFactory = new ClientFactoryImpl();
        final EventBus eventBus = clientFactory.getEventBus();
        placeController = clientFactory.getPlaceController();

        final ActivityMapper leftActivityMapper = new LeftActivityMapper(clientFactory);
        final ActivityManager leftActivityManager = new ActivityManager(leftActivityMapper, eventBus);

        final ActivityMapper rightActivityMapper = new RightActivityMapper(clientFactory);
        final ActivityManager rightActivityManager = new ActivityManager(rightActivityMapper, eventBus);

        final AppView appView = clientFactory.getAppView();
        appView.setPresenter(this);

        leftActivityManager.setDisplay(appView.getLeftView());
        rightActivityManager.setDisplay(appView.getRightView());

        final AppPlaceHistoryMapper historyMapper= GWT.create(AppPlaceHistoryMapper.class);
        final PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
        historyHandler.register(placeController, eventBus, defaultPlace);

        RootPanel.get().add(appView);

        historyHandler.handleCurrentHistory();
    }

    @Override
    public void goToA() {
        placeController.goTo(new APlace());
    }

    @Override
    public void goToB() {
        placeController.goTo(new BPlace());
    }
}
