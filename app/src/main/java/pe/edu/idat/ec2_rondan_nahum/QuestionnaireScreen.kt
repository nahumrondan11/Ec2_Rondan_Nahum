package pe.edu.idat.ec2_rondan_nahum

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun QuestionnaireScreen() {
    Scaffold {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("CUESTIONARIO", style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(bottom = 16.dp))

            // Pregunta 1
            Text("1. Marque sus platos favoritos.")
            val platos = listOf("Arroz con pollo", "Lomo Saltado", "Ají de gallina", "Tallarines", "Arroz Chaufa", "Otro")
            platos.forEach { plato ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(checked = false, onCheckedChange = {})
                    Text(plato)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Pregunta 2
            Text("2. ¿Visitaste algún país de Europa, Asia o África?")
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = false, onClick = {})
                Text("Sí")
                Spacer(modifier = Modifier.width(8.dp))
                RadioButton(selected = false, onClick = {})
                Text("No")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Pregunta 3
            Text("3. ¿Hablas Inglés?")
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = false, onClick = {})
                Text("Sí")
                Spacer(modifier = Modifier.width(8.dp))
                RadioButton(selected = false, onClick = {})
                Text("No")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Pregunta 4
            Text("4. ¿Te gusta la tecnología?")
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = false, onClick = {})
                Text("Sí")
                Spacer(modifier = Modifier.width(8.dp))
                RadioButton(selected = false, onClick = {})
                Text("No")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Pregunta 5
            Text("5. ¿Realizas trabajo remoto?")
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(selected = false, onClick = {})
                Text("Sí")
                Spacer(modifier = Modifier.width(8.dp))
                RadioButton(selected = false, onClick = {})
                Text("No")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Botón Resolver
            Button(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("Resolver")
            }
        }
    }
}