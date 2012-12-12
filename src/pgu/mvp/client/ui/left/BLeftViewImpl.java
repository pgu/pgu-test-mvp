package pgu.mvp.client.ui.left;

import pgu.mvp.client.ui.BLeftView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.Widget;

public class BLeftViewImpl extends Composite implements BLeftView {

    private static BLeftViewImplUiBinder uiBinder = GWT.create(BLeftViewImplUiBinder.class);

    interface BLeftViewImplUiBinder extends UiBinder<Widget, BLeftViewImpl> {
    }

    @UiField
    Frame b_frame;

    public BLeftViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
        testDiv("view:b");

        b_frame.addLoadHandler(new LoadHandler() {

            @Override
            public void onLoad(final LoadEvent event) {
                console("!! FRAME B has been loaded !!");
            }
        });

        b_frame.setUrl("http://pgu-translate.appspot.com/");

    }

    private native void console(String msg) /*-{
        $wnd.console.log(msg);
    }-*/;

    private native void testDiv(String title) /*-{

        $wnd.console.log(title);
        $wnd.console.log($wnd.document.getElementById('b_left_view'));

    }-*/;

}
