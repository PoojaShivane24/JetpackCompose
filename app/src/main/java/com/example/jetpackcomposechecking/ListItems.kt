package com.example.jetpackcomposechecking

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStream

class ListItems() {



    @Composable
    fun PreviewItem() {
        Column {
            DataManager.getUser().map { item ->
                UserItem(item.firstName, item.lastName,  item.email, item.gender)
            }
        }
    }


    @Composable
    fun UserItem(name : String, lastName : String, email : String, gender : String) {
        Card(
            modifier = Modifier.fillMaxWidth()
                .padding(0.dp, 15.dp, 0.dp, 0.dp)
        ) {
            Row(
                modifier = Modifier.padding(25.dp,10.dp, 25.dp, 10.dp)
            ) {
                Text(
                    text = name,
                    fontSize =17.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterVertically),
                )
                Spacer(Modifier.width(10.dp))
                ItemDescription(lastName, email, gender)
            }
        }
        Spacer(Modifier.width(10.dp))
    }



    data class User(var firstName : String, var lastName : String, var email : String, var gender : String)


}

@Composable
private fun ItemDescription(lastName: String, email: String, gender: String) {
    Column {
        Text(
            text = lastName,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        )
        Text(
            text = email,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        )
        Text(
            text = gender,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        )
    }
}