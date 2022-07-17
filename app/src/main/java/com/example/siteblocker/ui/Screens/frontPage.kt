package com.example.siteblocker.ui.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.siteblocker.R
import com.example.siteblocker.ui.theme.LightBlue
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EmptyContent(
    scope: CoroutineScope,
    bottomSheetState: ModalBottomSheetState
) {
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
        FloatingActionButton(
            modifier = Modifier.padding(top = 230.dp).size(100.dp),
            onClick = {
                scope.launch {
                    bottomSheetState.show()
                }
            },
            backgroundColor = LightBlue,
            contentColor = Color.White
        ) {
            Icon(
                modifier = Modifier.size(80.dp),
                painter = painterResource(id = R.drawable.ic_add),
                tint = Color.Blue,
                contentDescription = "")
        }
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = stringResource(id = R.string.empty_content),
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.h6.fontSize
        )
    }
}

