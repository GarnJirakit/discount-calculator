package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var price = findViewById<TextView>(R.id.num3)
        var num1 = findViewById<EditText>(R.id.num1)
        var num2 = findViewById<EditText>(R.id.num2)
        var checkbox = findViewById<CheckBox>(R.id.tax)
        var button = findViewById<Button>(R.id.btn)

        button.setOnClickListener(){
            var num1 =  num1.text.toString().toFloat()
            var num2 =  num2.text.toString().toFloat()
            var discount:Float = 0F
            var result:Float = 0F

            discount = (num2/100)-1.00.toFloat()
            result = num1*discount*-1

            if(checkbox.isChecked){
                discount = (num2/100)-1.00.toFloat()
                result = (num1*107)/100*discount*-1
            }
            price.setText(result.toString())
        }
    }
}