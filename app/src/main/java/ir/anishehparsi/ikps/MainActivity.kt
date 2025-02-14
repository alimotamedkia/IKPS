package ir.anishehparsi.ikps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ir.anishehparsi.ikps.ui.theme.IKPSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IKPSTheme {
                Scaffold(modifier = Modifier.fillMaxSize()
                    .statusBarsPadding()) { innerPadding ->

                    Login(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewFinal(modifier: Modifier = Modifier) {
    MainActivity()
}
