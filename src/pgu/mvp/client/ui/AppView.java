package pgu.mvp.client.ui;

import pgu.mvp.client.AppPresenter;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public interface AppView extends IsWidget {

    AcceptsOneWidget getLeftView();

    AcceptsOneWidget getRightView();

    void setPresenter(AppPresenter presenter);

}
