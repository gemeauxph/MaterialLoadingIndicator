package ph.gemeaux.materialloadingspinner;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;

public class MaterialLoadingSpinner {
    Context context;
    AlertDialog alertDialog;

    public MaterialLoadingSpinner (Context context) {
        this.context = context;
    }

    public void show() {

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View dialogView = inflater.inflate(R.layout.loading_view, null);
        dialogBuilder.setView(dialogView);

        alertDialog = dialogBuilder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    public void dismiss() {
        alertDialog.dismiss();
    }
}
