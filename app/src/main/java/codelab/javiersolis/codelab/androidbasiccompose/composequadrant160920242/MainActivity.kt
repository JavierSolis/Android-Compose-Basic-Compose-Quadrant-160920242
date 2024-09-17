package codelab.javiersolis.codelab.androidbasiccompose.composequadrant160920242

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import codelab.javiersolis.codelab.androidbasiccompose.composequadrant160920242.ui.theme.AndroidBasicComposeComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicComposeComposeQuadrantTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding() // Respeta la barra de notificaciones
                        .navigationBarsPadding() // Respeta los botones de navegación (abajo)
                ) {
                    ComposeQuadrantScreen()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantScreen( modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = modifier.weight(1f)
        )
        {
            ComposeQuadrant(
                idColor = R.color.color_1,
                idStrTitle = R.string.compose_title,
                idStrDesc = R.string.compose_desc,
                modifier = modifier.weight(1f)
            )
            ComposeQuadrant(
                idColor = R.color.color_2,
                idStrTitle = R.string.image_title,
                idStrDesc = R.string.image_desc,
                modifier = modifier.weight(1f)
            )
        }
        Row(
            modifier = modifier.weight(1f)
        )
        {
            ComposeQuadrant(
                idColor = R.color.color_3,
                idStrTitle = R.string.row_title,
                idStrDesc = R.string.row_desc,
                modifier = modifier.weight(1f)
            )
            ComposeQuadrant(
                idColor = R.color.color_4,
                idStrTitle = R.string.column_title,
                idStrDesc = R.string.column_desc,
                modifier = modifier.weight(1f)
            )
        }

    }
}

@Composable
fun ComposeQuadrant(
    idColor: Int,
    idStrTitle: Int,
    idStrDesc: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = colorResource(id = idColor)),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.padding(16.dp),
            )
        {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                fontWeight = FontWeight.Bold,
                text = stringResource(id = idStrTitle),
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier
                    .padding(16.dp),
                text = stringResource(id = idStrDesc),
                textAlign = TextAlign.Justify,
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantScreenPreview() {
    AndroidBasicComposeComposeQuadrantTheme {
        ComposeQuadrantScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    Column(
        modifier = Modifier.size(200.dp, 800.dp), // Especifica el tamaño del Column
    ) {
        ComposeQuadrant(
            idColor = R.color.color_1,
            idStrTitle = R.string.image_title,
            idStrDesc = R.string.image_desc,
            modifier = Modifier.weight(1f)
        )
        ComposeQuadrant(
            idColor = R.color.color_2,
            idStrTitle = R.string.image_title,
            idStrDesc = R.string.image_desc,
            modifier = Modifier.weight(1f)
        )
    }
}
