import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Decare variables as arrays so as to group together the Number and Expressions
        var myNumbers: Int = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        var myExpressions: String = arrayOf(+, -, /, *, (, ), =)

        // All the variables above are Buttons
        myNumbersButton = findViewById<Button>(R.id.myNumbersButton)
        myExpressionsButton = findViewById<Button>(R.id.myExpressionsButton)
    }
}