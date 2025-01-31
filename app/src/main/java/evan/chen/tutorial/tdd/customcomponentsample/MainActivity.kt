package evan.chen.tutorial.tdd.customcomponentsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var numberSelect: NumberSelect

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.numberSelect = this.findViewById(R.id.number_select) as NumberSelect

        this.numberSelect.setListener(object : NumberSelect.NumberSelectListener {

            override fun onValueChange(value: Int) {
                Log.d("onValueChange", value.toString())
            }
        })
    }
}
