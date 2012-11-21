package pgu.mvp.client;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class BLeftActivity extends AbstractActivity {

    private final ClientFactory clientFactory;

    public BLeftActivity(final BPlace place, final ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
        testDiv("activity:b:start:before");
        panel.setWidget(clientFactory.getBLeftView().asWidget());
        testDiv("activity:b:start:after");
        addLabel();
    }

    private native void addLabel() /*-{
        var div = $wnd.document.getElementById("b_left_view");
        div.innerHTML += ' toto ';
    }-*/;

    private native void testDiv(String title) /*-{

        $wnd.console.log(title);
        $wnd.console.log($wnd.document.getElementById('b_left_view'));

    }-*/;

}
