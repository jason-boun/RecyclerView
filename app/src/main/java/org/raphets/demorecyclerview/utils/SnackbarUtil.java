package org.raphets.demorecyclerview.utils;

import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by codeest on 16/9/3.
 */

public class SnackbarUtil {

    public static void show(final View view, final String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).setAction("点击", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "哈哈", Toast.LENGTH_SHORT).show();
            }
        }).setCallback(new Snackbar.Callback() {
            @Override
            public void onShown(Snackbar snackbar) {
                super.onShown(snackbar);
                Toast.makeText(view.getContext(), "onShown==", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDismissed(Snackbar snackbar, int event) {
                super.onDismissed(snackbar, event);
                Toast.makeText(view.getContext(), "onDismissed==" + event, Toast.LENGTH_SHORT).show();
            }

        }).show();
    }

    public static void showShort(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }
}
