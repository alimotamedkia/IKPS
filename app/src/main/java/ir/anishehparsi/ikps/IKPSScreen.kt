package ir.anishehparsi.ikps

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MessageItem(modifier: Modifier = Modifier, item: RpoData) {
    Column (modifier=Modifier.border(border = BorderStroke(3.dp, color=Color(0x00000000)))) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(item.image),
                contentDescription = ""
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(text = item.name)
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = item.description,
                    fontSize = 12.sp,
                    color = Color(0x88111111)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(text = item.date, fontSize = 12.sp, color = Color(0x66111111))
        }
    }
}

@Composable
fun MessageList(modifier: Modifier = Modifier) {
    LazyColumn (modifier= modifier.padding(horizontal = 8.dp)){
        items(RpoListData) {
MessageItem(item = it)
        }
    }

}

@Preview (showBackground = true)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    MessageList()
}