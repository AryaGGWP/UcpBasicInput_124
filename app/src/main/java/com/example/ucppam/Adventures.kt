package com.example.ucppam

import android.webkit.WebStorage.Origin
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun HeaderSection(){
        Column(verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize())
        {
            Box(modifier = Modifier.fillMaxWidth()
                .background(color = Color.Blue)
                .padding(15.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.celsi),
                    modifier = Modifier.size(80.dp).clip(CircleShape),
                    contentDescription = null)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column {
                        Spacer(modifier = Modifier.height(16.dp))

                        Icon(imageVector = Icons.Default.AccountBox, contentDescription = null, tint = Color.White)
                        Text(text = "Arya Dio Fenanto",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = Color.White,
                            modifier = Modifier.align(Alignment.Start))
                        Text(text = "Provinsi Lampung",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Normal)
                    }
            }
            }
        }

@Composable
fun Adventures(modifier: Modifier = Modifier) {
    var origin by remember { mutableStateOf("") }
    var Departure by remember { mutableStateOf("") }
    var Arrival by remember { mutableStateOf("") }
    var selectedTransportation by remember { mutableStateOf("") }
    var originsv by remember { mutableStateOf("") }
    var Departuresv by remember { mutableStateOf("") }
    var arrivalsv by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().background(Color.White)
    )
    {
        HeaderSection()

        Column(modifier = Modifier.fillMaxWidth().padding(16.dp))
        {
            Text(
                text = "Plan Your Adventures",
                color = Color.Black, fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Plan Your Adventures",
                color = Color.Gray, fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = origin,
                onValueChange = { origin = it },
                label = { Text("Asal Daerah") },
                leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },
                modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(20.dp)
            )
        }
    }
}