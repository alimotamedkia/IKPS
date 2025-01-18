package ir.anishehparsi.ikps


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Chat(item:ChatItemData) {
   Row {
       Row(modifier = Modifier.weight(2f), verticalAlignment = Alignment.CenterVertically) {
           Image(
               modifier = Modifier
                   .clip(CircleShape)
                   .size(64.dp),
               painter = painterResource(item.image),
               contentDescription = "",
               contentScale = ContentScale.Crop
           )
           Spacer(Modifier.width(12.dp))
           Column {
               Text(
                   text = item.name,
                   color = Color.White
               )
               Text(
                   text = item.message,
                   color = Color.White,
                   maxLines = 1,
                   overflow = TextOverflow.Ellipsis
               )
           }
           Spacer(Modifier.weight(1f))
           Text(
               text = item.date,
               color = Color.Gray
           )
           Spacer(Modifier.weight(0.6f))

       }

   }
}

data class ChatItemData(val name:String, val message:String, val date:String, val image:Int){

}

@Preview(showBackground = true)
@Composable
fun PreviewChat(modifier: Modifier = Modifier) {
    Chat(ChatItemData("Ali", "Last seen yesterday at 10:54", "yesterday", R.drawable.sat))
}