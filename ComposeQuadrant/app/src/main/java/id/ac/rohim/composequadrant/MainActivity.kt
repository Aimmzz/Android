package id.ac.rohim.composequadrant

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ac.rohim.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TextComposable(
    title: String,
    description: String
) {
    Column(

        modifier = Modifier
            .padding(bottom = 16.dp)
            .fillMaxWidth()
    ) {
        Row(Modifier.weight(1f)) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextComposablePreview() {
    ComposeQuadrantTheme {
        TextComposable("Text composable", "Displays text and follows Material Design guidelines." )
    }
}