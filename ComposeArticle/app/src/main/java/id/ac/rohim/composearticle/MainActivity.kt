package id.ac.rohim.composearticle

import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.ac.rohim.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticleImage(getString(R.string.article1) , getString(R.string.article2) , getString(R.string.article3) )

                }
            }
        }
    }
}

@Composable
fun ArticleImage(Article1: String, Article2: String, Article3: String){
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = Article1,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = Article2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = Article3,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }
    
}

@Preview(showSystemUi = true)
@Composable
fun ArticleImagePreview() {
    ComposeArticleTheme {
        ArticleImage(
            stringResource(R.string.article1),
            stringResource(R.string.article2),
            stringResource(R.string.article3)
        )
    }
}