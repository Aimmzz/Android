package id.ac.rohim.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.ac.rohim.namecard.ui.theme.NameCardTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.onSecondary
                ) {
                    FillCard()
                    MyContact()
                }
            }
        }
    }
}

@Composable
fun FillCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
        )
        Text(
            text = "Rohim Kurniawan",
            fontSize = 35.sp,
            color = Color(0xFF3ddc84)
        )
        Text(
            text = "Chief Executive Officer",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 230.dp),
            color = Color(0xFF3ddc84)
        )
    }
}
@Composable
fun MyContact(){
    Column(
        verticalArrangement = Arrangement.Bottom
    ) {
        Row() {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 30.dp, end = 40.dp, bottom = 12.dp)
                    .width(20.dp)
                    .height(30.dp),
                Color(0xFF3ddc84)
            )
            Text(
                text = "+6281381755824",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFF3ddc84)
            )
        }
        Row(
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                Modifier
                    .padding(bottom = 12.dp, start = 30.dp, end = 40.dp)
                    .width(20.dp)
                    .height(30.dp),
                Color(0xFF3ddc84)
            )
            Text(
                text = "g.dev/rohimkurniawan123",
                fontSize = 20.sp,
                color = Color(0xFF3ddc84)
            )
        }
        Row() {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                Modifier
                    .padding(bottom = 90.dp, start = 30.dp, end = 40.dp)
                    .width(20.dp)
                    .height(30.dp),
                Color(0xFF3ddc84)
            )
            Text(
                text = "rohimkurniawan456@gmail.com",
                fontSize = 20.sp,
                color = Color(0xFF3ddc84)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun FillCArdPreview() {
    NameCardTheme {
        FillCard()
        MyContact()
    }
}