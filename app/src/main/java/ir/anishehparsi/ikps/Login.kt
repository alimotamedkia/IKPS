package ir.anishehparsi.ikps

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login(modifier: Modifier = Modifier) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffcfcfcf))
    ) {
        Image(
            painter = painterResource(R.drawable.irankhodro_back_login),
            contentDescription = "Iran Khodro Background Logo"
        )

    }
    Column(
        modifier = Modifier
            .padding(top = 40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.app_name),
            color = Color(0Xffffffff),
            fontSize = 48.sp,
            fontFamily = FontFamily(Font(R.font.vazir_black))
        )
        Spacer(modifier.size(10.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp), shape = RoundedCornerShape(size = 25.dp)
        ) {

            Text(
                text = stringResource(R.string.login_guid),
                color = Color(0xFF388e3c),
                fontFamily = FontFamily(Font(R.font.vazir_medium)),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
                    .padding(24.dp)
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0x991576CD),
                    unfocusedLabelColor = Color(0x99013D72),
                    focusedLabelColor = Color(0x990176CD),
                    cursorColor = Color(0x4B1576CD)
                ),
                label = { Text(text = "Username") },
                value = "",
                onValueChange = { })
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0x991576CD),
                    unfocusedLabelColor = Color(0x99013D72),
                    focusedLabelColor = Color(0x990176CD),
                    cursorColor = Color(0x4B1576CD)
                ),
                label = { Text(text = "Password") },
                value = "",
                onValueChange = { })
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0277dd)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
            ) {
                Text(
                    text = stringResource(R.string.enter),
                    fontFamily = FontFamily(Font(R.font.vazir_medium)),
                    color = Color.White
                )
            }
            Spacer(modifier.size(2.dp))

        }

    }
}

@Preview
@Composable
fun Preview1(modifier: Modifier = Modifier) {
    Login()

}

