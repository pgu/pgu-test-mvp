package pgu.mvp.client;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class BRightActivity extends AbstractActivity {

    private final ClientFactory clientFactory;

    public BRightActivity(final BPlace place, final ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
        panel.setWidget(clientFactory.getBRightView().asWidget());
    }

}
