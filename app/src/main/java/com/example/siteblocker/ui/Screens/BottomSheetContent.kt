package com.example.siteblocker.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.siteblocker.R
import java.nio.file.WatchEvent

@Composable
fun BottomSheetContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Text(
            modifier = Modifier.padding(start = 15.dp),
            text = "Add Timing",
            color = Color.Black,
            fontSize = MaterialTheme.typography.h5.fontSize,
            fontWeight = FontWeight.Bold
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column (verticalArrangement = Arrangement.Bottom){
                Text(
                    text = "From",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.body1.fontSize
                )
                Text(
                    text = "From",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.body1.fontSize
                )
            }
            Column (verticalArrangement = Arrangement.Bottom){
                Text(
                    text = "To",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.body1.fontSize
                )
                Text(
                    text = "From",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.body1.fontSize
                )
            }
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Save")
        }
    }
}


@Composable
@Preview
fun BottomSheetContentPreview() {
    BottomSheetContent()
}