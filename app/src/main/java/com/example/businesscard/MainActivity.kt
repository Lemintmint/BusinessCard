package com.example.businesscard//.MainActivity

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

//import kotlinx.coroutines.flow.internal.NoOpContinuation.context
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context


object FontLoader {
    val fontFamily by lazy {
        FontFamily (
            Font(R.font.googlefonttest)
        )
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCard()
                    AddressCard()
                }
            }
        }
    }
}

@Composable
fun NameCard(): Unit {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(color = colorResource(id = R.color.lilac))
    ) {
        Image(
            painter = painterResource(id = R.drawable.leminticon),
            contentDescription = "Lemint's Icon",
            modifier = Modifier
                .size(180.dp)
        )
        Text(
            text = stringResource(id = R.string.name),
            fontFamily = FontLoader.fontFamily,
            fontSize = 56.sp,
            color = colorResource(id = R.color.purple_700),
            modifier = Modifier
        )
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 24.sp,
            color = colorResource(id = R.color.yellow),
            modifier = Modifier
        )
    }
}


@Composable
fun AddressCard(): Unit {
    val myAppIcons = Icons.Rounded
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .padding(bottom = 32.dp)
    ) {
        Column(
            modifier = Modifier
                .background(color = colorResource(id = R.color.lavender))
                .padding(start = 100.dp, end = 100.dp, top = 16.dp, bottom = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Icon(
                    myAppIcons.Person,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )

                Text(
                    text = buildAnnotatedString {
                        append(stringResource(id = R.string.twitter))
                        addStyle(
                            style = MaterialTheme.typography.bodyLarge.toSpanStyle().copy(
                                color = colorResource(id = R.color.blue),
                                textDecoration = TextDecoration.Underline,
                                fontSize = 24.sp
                            ),
                            start = 0,
                            end = this.length
                        )
                    },
                    modifier = Modifier
                        .clickable(
                            onClick = {
                                val intent = Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("https://twitter.com/le_M_int")
                                )
                                //startActivity(this@MainActivity, intent, null)
                            }
                        )
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Icon(
                    myAppIcons.PlayArrow,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )

                Text(
                    text = buildAnnotatedString {
                        append(stringResource(id = R.string.niconico))
                        addStyle(
                            style = MaterialTheme.typography.bodyLarge.toSpanStyle().copy(
                                color = colorResource(id = R.color.blue),
                                textDecoration = TextDecoration.Underline,
                                fontSize = 24.sp
                            ),
                            start = 0,
                            end = this.length
                        )
                    },
                    modifier = Modifier
                        .clickable(
                            onClick = {
                                val intent = Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("https://www.nicovideo.jp/user/121636330")
                                )
                                //startActivity(this@MainActivity, intent, null)
                            }
                        )
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Icon(
                    myAppIcons.PlayArrow,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )

                Text(
                    text = buildAnnotatedString {
                        append(stringResource(id = R.string.youtube))
                        addStyle(
                            style = MaterialTheme.typography.bodyLarge.toSpanStyle().copy(
                                color = colorResource(id = R.color.blue),
                                textDecoration = TextDecoration.Underline,
                                fontSize = 24.sp
                            ),
                            start = 0,
                            end = this.length
                        )
                    },
                    modifier = Modifier
                        .clickable(
                            onClick = {
                                val intent = Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://www.youtube.com/channel/UCHJbC0yAotni47fFwrexqdQ"))
                                //startActivity(this@MainActivity, intent, null)
                            }
                        )
                )
            }

            Row(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Icon(
                    myAppIcons.PlayArrow,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )

                Text(
                    text = buildAnnotatedString {
                        append(stringResource(id = R.string.piapro))
                        addStyle(
                            style = MaterialTheme.typography.bodyLarge.toSpanStyle().copy(
                                color = colorResource(id = R.color.blue),
                                textDecoration = TextDecoration.Underline,
                                fontSize = 24.sp
                            ),
                            start = 0,
                            end = this.length
                        )
                    },
                    modifier = Modifier
                        .clickable(
                            onClick = {
                                val intent = Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://piapro.jp/Lemintp"))
                                //startActivity(this@MainActivity, intent, null)
                            }
                        )
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    BusinessCardTheme {
        NameCard()
        AddressCard()
    }
}