import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Decare variables as arrays so as to group together the Number and Expressions
        var myNumbers = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        var myExpressions = arrayOf("+", "-", "*", "(", ")", "=", "/")

        // All the variables above are Buttons
        lateinit var myNumbers: Button
        lateinit var myExpressions: Button

        myNumbersButton = findViewById<Button>(R.id.myNumbersButton)
        myExpressionsButton = findViewById<Button>(R.id.myExpressionsButton)

        // Appending Numbers Digits
        myNumbersButton0.setOnClickListener {
            // Append the button 0
            myEditText.append("0")
        }

        myNumbersButton1.setOnClickListener {
            // Append the value 1
            myEditText.append("1")
        }

        myNumbersButton2.setOnClickListener {
            // Append the value 2
            myEditText.append("2")
        }

        myNumbersButton3.setOnClickListener {
            // Append 3
            myEditText.append("3")
        }

        myNumbersButton4.setOnClickListener {
            // Append 4
            myEditText.append("4")
        }

        myNumberssButton5.setOnClickListener {
            // Append 5
            myEditText.append("5")
        }

        myNumbersButton6.setOnClickListener {
            // Append 6
            myEditText.append("6")
        }

        myNumbersButton7.setOnClickListener {
            // Append 7
            myEditText.append("7")
        }

        myNumbersButton8.setOnClickListener {
            // Append 8
            myEditText.append("8")
        }

        myNumbersButton9.setOnClickListener {
            // Append 9
            myEditText.append("9")
        }

        // Append Expressions
        myExpressionsButton"+".setOnClickListener {
            myEditText.append("+")
        }

        myExpressionsButton"/".setOnClickListener {
            myEditText.append("/")
        }

        myExpressionsButton"-".setOnClickListener {
            myEditText.append("-")
        }

        myExpressionsButton"=".setOnClickListener {
            myEditText.append("=")
        }

        myExpressionsButton"*".setOnClickListener {
            myEditText.append("*")
        }

        myExpressionsButton"(".setOnClickListener {
            myEditText.append("(")
        }

        myExpressionsButton")".setOnClickListener {
            myEditText.append(")")
        }
    }
}