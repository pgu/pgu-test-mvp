package pgu.mvp.client.ui.right;

import pgu.mvp.client.ui.BRightView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class BRightViewImpl extends Composite implements  BRightView {

    private static BRightViewImplUiBinder uiBinder = GWT.create(BRightViewImplUiBinder.class);

    interface BRightViewImplUiBinder extends UiBinder<Widget, BRightViewImpl> {
    }

    public BRightViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
