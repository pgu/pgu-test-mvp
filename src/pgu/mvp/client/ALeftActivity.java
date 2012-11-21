package pgu.mvp.client;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ALeftActivity extends AbstractActivity {

    private final ClientFactory clientFactory;

    public ALeftActivity(final APlace place, final ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
        testDiv("activity:a:start:before");
        panel.setWidget(clientFactory.getALeftView().asWidget());
        testDiv("activity:a:start:after");
    }

    private native void testDiv(String title) /*-{

        $wnd.console.log(title);
        $wnd.console.log($wnd.document.getElementById('a_left_view'));

    }-*/;

}
