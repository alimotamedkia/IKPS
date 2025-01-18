package ir.anishehparsi.ikps

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MessageItem(modifier: Modifier = Modifier, item: RpoData) {

    Column(
        modifier.padding(12.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape),
                painter = painterResource(item.image),
                contentDescription = ""
            )
                Text(text = item.name, fontSize = 16.sp)
        }
    }
}


@Composable
fun MessageList(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(horizontal = 8.dp)) {
        items(RpoListData) {
            MessageItem(item = it)
            HorizontalDivider()
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    MessageList()
}