package com.example.jertpack2

import android.os.Bundle
import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jertpack2.ui.theme.Jertpack2Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setUi()
        }
    }

    @Composable

    fun setUi() {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally
//            verticalArrangement = Arrangement.SpaceEvenly
//
//        ) {}
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.purple_200))
                .horizontalScroll(rememberScrollState()),
            //   verticalAlignment=Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround


        ) {
            Text(
                text = "Hello",
                color = Color.Magenta,
                modifier = Modifier
                    .width(120.dp)
                    .height(100.dp)
//                    .fillMaxSize(0.5f)
                    .width(120.dp)
                    .padding(top = 30.dp, start = 8.dp)
                    .background(Color.Gray)
                    .padding(20.dp)
            )
            Text(
                text = "Hello",
                color = Color.Magenta,
                modifier = Modifier
                    .width(120.dp)
                    .height(100.dp)
//                    .fillMaxSize(0.1f)
                    .padding(top = 30.dp, start = 8.dp, end = 8.dp)
                    .background(Color.Gray)
                    .padding(20.dp)
            )
            Text(
                text = "Hello",
                color = Color.Magenta,
                modifier = Modifier
                    .width(120.dp)
                    .height(100.dp)
                    .padding(top = 30.dp, start = 8.dp, end = 8.dp)
                    .background(Color.Gray)
                    .padding(20.dp)
            )
            Text(
                text = "Hello",
                color = Color.Magenta,
                modifier = Modifier
                    .width(120.dp)
                    .height(100.dp)
                    .padding(top = 30.dp, start = 8.dp, end = 8.dp)
                    .background(Color.Gray)
                    .padding(20.dp)
            )
            Text(
                text = "Hello",
                color = Color.Magenta,
                modifier = Modifier
                    .width(120.dp)
                    .height(100.dp)
                    .padding(top = 30.dp, start = 8.dp, end = 8.dp)
                    .background(Color.Gray)
                    .padding(20.dp)
            )
        }


    }

    @Preview(
        showBackground = true,
        name = "Test",
        widthDp = 400,
        heightDp = 500,
        showSystemUi = true,
        // device = Devices.NEXUS_10
    )
    @Composable
    fun setPreview() {
        setUi()

    }
}






