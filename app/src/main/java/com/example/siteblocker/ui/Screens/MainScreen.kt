package com.example.siteblocker.ui.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.siteblocker.R

@Composable
fun mainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(top = 20.dp),
            text = stringResource(id = R.string.schedule),
            color = Color.Black,
            fontSize = MaterialTheme.typography.h2.fontSize
        )
        Spacer(modifier = Modifier.height(15.dp))
        Card(
            modifier = Modifier.padding(20.dp),
            border = BorderStroke(2.dp, Color.LightGray)
        ) {
            cardContent()
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(top = 25.dp),
            text = "MODE",
            color = Color.Black,
            fontSize = MaterialTheme.typography.h2.fontSize
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            val checkedState = remember {
                mutableStateOf(false)
            }
            Text(
                text = "Whitelist",
                color = Color.Black,
                fontSize = MaterialTheme.typography.body1.fontSize,
                fontWeight = FontWeight.Bold
            )
            Switch(
                modifier = Modifier.size(30.dp,15.dp),
                checked = checkedState.value ,
                onCheckedChange = {checkedState.value = it}
            )
            Text(
                text = "Blacklist",
                color = Color.Black,
                fontSize = MaterialTheme.typography.body1.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
@Preview
fun mainScreenPreview() {
    mainScreen()
}