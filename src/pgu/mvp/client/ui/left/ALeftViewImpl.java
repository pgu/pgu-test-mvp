package pgu.mvp.client.ui.left;

import pgu.mvp.client.ui.ALeftView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ALeftViewImpl extends Composite implements ALeftView {

    private static ALeftViewImplUiBinder uiBinder = GWT.create(ALeftViewImplUiBinder.class);

    interface ALeftViewImplUiBinder extends UiBinder<Widget, ALeftViewImpl> {
    }

    public ALeftViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
