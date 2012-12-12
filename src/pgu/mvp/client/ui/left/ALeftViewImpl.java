package pgu.mvp.client.ui.left;

import pgu.mvp.client.ui.ALeftView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.Widget;

public class ALeftViewImpl extends Composite implements ALeftView {

    private static ALeftViewImplUiBinder uiBinder = GWT.create(ALeftViewImplUiBinder.class);

    interface ALeftViewImplUiBinder extends UiBinder<Widget, ALeftViewImpl> {
    }

    @UiField
    Frame a_frame;

    public ALeftViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
        testDiv("view:a");

        a_frame.addLoadHandler(new LoadHandler() {

            @Override
            public void onLoad(final LoadEvent event) {
                console("!! FRAME A has been loaded !!");
            }
        });

        a_frame.setUrl("http://www.bing.com/");
    }

    private native void console(String msg) /*-{
        $wnd.console.log(msg);
    }-*/;

    private native void testDiv(String title) /*-{

        $wnd.console.log(title);
        $wnd.console.log($wnd.document.getElementById('a_left_view'));

    }-*/;

}
