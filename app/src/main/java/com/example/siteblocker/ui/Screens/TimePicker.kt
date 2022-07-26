package com.example.siteblocker.ui.Screens

import android.app.TimePickerDialog
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.siteblocker.R
import java.util.*

@Composable
@Preview
fun ShowTimePicker() {

    val context = LocalContext.current

    val calendar = Calendar.getInstance()
    val hour = calendar[Calendar.HOUR_OF_DAY]
    val minute = calendar[Calendar.MINUTE]

    var time by remember { mutableStateOf("") }
    val timePickerDialog = TimePickerDialog(
        context,
        { _, hour: Int, minute: Int ->
            time = "$hour:$minute"
        }, hour, minute, true
    )

    Row(
        modifier = Modifier.width(140.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedTextField(
            value = time,
            onValueChange = {
                time = it
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_dropdownmenu),
                    contentDescription = null,
                    modifier = Modifier
                        .clickable(
                            enabled = true,
                            role = Role.Button,
                            onClick = {
                                timePickerDialog.show()
                            }
                        )
                )
            },
            readOnly = false,
            modifier = Modifier.wrapContentSize()
        )
    }

}