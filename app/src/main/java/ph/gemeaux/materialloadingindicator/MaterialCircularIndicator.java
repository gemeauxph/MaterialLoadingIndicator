package ph.gemeaux.materialloadingindicator;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public class MaterialCircularIndicator {
    Context context;
    AlertDialog alertDialog;
    CircularProgressIndicator progressIndicator;
    TextView tvMessage;
    LinearLayout lytBackground;
    AlertDialog.Builder dialogBuilder;
    LayoutInflater inflater;
    View dialogView;

    public MaterialCircularIndicator(Context context) {

        this.context = context;

        dialogBuilder = new AlertDialog.Builder(context);
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        dialogView = inflater.inflate(R.layout.loading_view, null);
        dialogBuilder.setView(dialogView);

        progressIndicator = dialogView.findViewById(R.id.circularProgressIndicator);
        tvMessage = dialogView.findViewById(R.id.tvMessage);
        lytBackground = dialogView.findViewById(R.id.background);

        alertDialog = dialogBuilder.create();
        alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        alertDialog.setCancelable(false);
    }

    public void show() {
        alertDialog.show();
    }

    public void dismiss() {
        alertDialog.dismiss();
    }

    public void setBackgroundColor(int color) {
        lytBackground.setBackgroundColor(color);
    }

    public void setCanceleable(boolean canceleable) {
        alertDialog.setCancelable(canceleable);
    }

    public void setProgress(int progress) {
        progressIndicator.setProgressCompat(progress, true);
    }

    public void setIndeterminate(boolean isIndeterminate) {
        progressIndicator.setIndeterminate(isIndeterminate);
    }

    public void setIndicatorSize(int dps) {
        progressIndicator.setIndicatorSize(convertDpToPx(dps));
    }

    public void setTrackThickness(int dps) {
        progressIndicator.setTrackThickness(convertDpToPx(dps));
    }

    public void setTrackCornerRadius(int dps) {
        progressIndicator.setTrackCornerRadius(convertDpToPx(dps));
    }

    public void setIndicatorColor(int color) {
        progressIndicator.setIndicatorColor(color);
    }

    public void setTrackColor(int color) {
        progressIndicator.setTrackColor(color);
    }

    public void setLoadingMessage(String msg) {
        tvMessage.setText(msg);
    }

    public void setMessageTextColor(int color) {
        tvMessage.setTextColor(color);
    }

    public void setTextSize(float size) {
        tvMessage.setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
    }

    public void setMessageTypeFace(int typeFace) {
        tvMessage.setTypeface(null, typeFace);
    }

    private int convertDpToPx(int dps) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dps * scale + 0.5f);
    }
}
