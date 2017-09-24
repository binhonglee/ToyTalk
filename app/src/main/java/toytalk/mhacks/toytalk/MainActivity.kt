package toytalk.mhacks.toytalk

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var lightOneOff : Button? = null
    private var lightOneOn : Button? = null
    private var lightOneLbl : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lightOneLbl = findViewById<TextView>(R.id.LightOneLbl) as TextView
        lightOneOff = findViewById<Button>(R.id.LightOneOffBtn) as Button
        lightOneOn = findViewById<Button>(R.id.LightOneOnBtn) as Button

        lightOneOn!!.setOnClickListener {
            lightOneLbl!!.setTextColor(Color.RED)
        }

        lightOneOff!!.setOnClickListener {
            lightOneLbl!!.setTextColor(Color.GRAY)
        }
    }

}
