package org.ebookdroid.ui.settings.fragments;

import com.adsi.kioware.client.mobile.pdf.app.R;

import android.annotation.TargetApi;

@TargetApi(11)
public class RenderFragment extends BasePreferenceFragment {

    public RenderFragment() {
        super(R.xml.fragment_render);
    }

    @Override
    public void decorate() {
        super.decorate();
        decorator.decorateRenderSettings();
    }
}
