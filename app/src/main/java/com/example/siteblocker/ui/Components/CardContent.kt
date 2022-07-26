package com.example.siteblocker.ui.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun cardContent(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(verticalArrangement = Arrangement.Bottom) {
                Text(
                    text = "STARTS",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.body2.fontSize
                )
                Text(
                    text = "11:00 AM",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.body1.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(verticalArrangement = Arrangement.Bottom) {
                Text(
                    text = "ENDS",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.body2.fontSize
                )
                Text(
                    text = "12:00 PM",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.body1.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Text(
                text = "Edit",
                color = Color.Black,
                fontSize = MaterialTheme.typography.body1.fontSize
            )
            Text(
                text = "Delete",
                color = Color.Black,
                fontSize = MaterialTheme.typography.body1.fontSize,
            )
        }
    }
}