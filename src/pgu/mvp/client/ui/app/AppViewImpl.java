package pgu.mvp.client.ui.app;

import pgu.mvp.client.AppPresenter;
import pgu.mvp.client.ui.AppView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class AppViewImpl extends Composite implements AppView {

    private static AppViewImplUiBinder uiBinder = GWT.create(AppViewImplUiBinder.class);

    interface AppViewImplUiBinder extends UiBinder<Widget, AppViewImpl> {
    }

    @UiField
    HTMLPanel menu;
    @UiField
    SimplePanel leftPanel, rightPanel;
    @UiField
    Button goToPlaceABtn, goToPlaceBBtn;

    public AppViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    private AppPresenter presenter;

    @Override
    public void setPresenter(final AppPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public AcceptsOneWidget getLeftView() {
        return leftPanel;
    }

    @Override
    public AcceptsOneWidget getRightView() {
        return rightPanel;
    }

    @UiHandler("goToPlaceABtn")
    public void clickGoToA(final ClickEvent e) {
        presenter.goToA();
    }

    @UiHandler("goToPlaceBBtn")
    public void clickGoToB(final ClickEvent e) {
        presenter.goToB();
    }

}
