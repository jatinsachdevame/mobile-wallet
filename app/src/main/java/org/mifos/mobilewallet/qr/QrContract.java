package org.mifos.mobilewallet.qr;

import android.graphics.Bitmap;

import org.mifos.mobilewallet.core.BasePresenter;
import org.mifos.mobilewallet.core.BaseView;

/**
 * Created by naman on 8/7/17.
 */

public interface QrContract {

    interface ShowQrView extends BaseView<ShowQrPresenter> {

        void showGeneratedQr(Bitmap bitmap);
    }

    interface ShowQrPresenter extends BasePresenter {

        void generateQr(String data, int amount);
    }
}
