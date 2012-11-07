package pgu.mvp.client.ui.left;

import pgu.mvp.client.ui.BLeftView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class BLeftViewImpl extends Composite implements BLeftView {

    private static BLeftViewImplUiBinder uiBinder = GWT.create(BLeftViewImplUiBinder.class);

    interface BLeftViewImplUiBinder extends UiBinder<Widget, BLeftViewImpl> {
    }

    public BLeftViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
