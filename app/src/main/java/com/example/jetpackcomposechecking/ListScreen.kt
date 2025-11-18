package com.example.jetpackcomposechecking


import android.util.Log
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView


class ListScreen {

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun Heading() {
        Column(modifier = Modifier.statusBarsPadding()) {
            Box(
                /*Card (
                colors = CardDefaults.cardColors(containerColor = Color.Blue),
                shape = RectangleShape,*/
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)
            ) {
                Row(
                    modifier = Modifier.padding(25.dp, 10.dp, 4.dp, 25.dp)
                ) {
                    Image(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        colorFilter = ColorFilter.tint(Color.White),
                        alignment = Alignment.Center,
                        contentDescription = "user",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(
                        text = "YES BANK Prepaid Card",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 23.sp
                    )
                }
            }
            SetBackgroundStyle()
            ListArea()
        }
    }

    @Composable
    fun SetBackgroundStyle() {
        Log.i("flow", "SetBackgroundStyle 1")
        AndroidView(
            factory = { context ->
                View(context).apply {
                    setBackgroundResource(R.drawable.bg_style)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
//                .padding(0.dp, -10.dp, 0.dp, 0.dp)
        )
        /*Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg_style),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 5.dp, 0.dp, 0.dp),
                contentScale = ContentScale.FillBounds
            )
        }*/
    }


    @Composable
    fun ListArea() {
        Log.i("flow", "ListArea 2")
        Column(
            modifier = Modifier.padding(25.dp)
        ) {
            Text(
                text = "Linked Programs",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = "We found below programs linked to your mobile number",
                color = colorResource(id = R.color.black),
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
            )
            val listItems = ListItems()
            listItems.PreviewItem()

        }


    }
}