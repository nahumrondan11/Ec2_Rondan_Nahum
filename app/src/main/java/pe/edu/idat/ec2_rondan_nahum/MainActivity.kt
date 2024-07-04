package pe.edu.idat.ec2_rondan_nahum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.ec2_rondan_nahum.ui.theme.Ec2_Rondan_NahumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ec2_Rondan_NahumTheme {

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ec2_Rondan_NahumTheme {

    }
}