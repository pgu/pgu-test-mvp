package pgu.mvp.client.ui.right;

import pgu.mvp.client.ui.ARightView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ARightViewImpl extends Composite implements ARightView {

    private static ARightViewImplUiBinder uiBinder = GWT.create(ARightViewImplUiBinder.class);

    interface ARightViewImplUiBinder extends UiBinder<Widget, ARightViewImpl> {
    }

    public ARightViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
