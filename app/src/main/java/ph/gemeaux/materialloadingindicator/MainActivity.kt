package ph.gemeaux.materialloadingindicator

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressIndicator =
            MaterialCircularIndicator(this)
        //progressIndicator.setCanceleable(true)
        //progressIndicator.setIndicatorSize(100)
        //progressIndicator.setTrackThickness(10)
        progressIndicator.setTrackCornerRadius(10)
        progressIndicator.setIndicatorColor(Color.parseColor("#4287F5"))
        progressIndicator.setTrackColor(Color.parseColor("#AEC9F5"))
        //progressIndicator.setMessageTextColor(Color.parseColor("#000000"))
        //progressIndicator.setLoadingMessage("Loading...")
        //progressIndicator.setTextSize(20f)
        //progressIndicator.setMessageTypeFace(Typeface.BOLD)
        //progressIndicator.setProgress(90)
        //progressIndicator.setIndeterminate(true)
        //progressIndicator.setBackgroundColor(Color.parseColor("#FFFFFF"))
        progressIndicator.show()
    }
}