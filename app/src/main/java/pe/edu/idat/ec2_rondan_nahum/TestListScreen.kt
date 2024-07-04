package pe.edu.idat.ec2_rondan_nahum

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pe.edu.idat.ec2_rondan_nahum.model.TestPsicologico

@Composable
fun TestListScreen() {
    val tests = listOf(
        TestPsicologico("Test 1", "Descripción del Test 1", "01-01-2023"),
        TestPsicologico("Test 2", "Descripción del Test 2", "02-01-2023"),
        TestPsicologico("Test 3", "Descripción del Test 3", "03-01-2023"),
        TestPsicologico("Test 4", "Descripción del Test 4", "04-01-2023"),
        TestPsicologico("Test 5", "Descripción del Test 5", "05-01-2023"),
        TestPsicologico("Test 6", "Descripción del Test 6", "06-01-2023"),
        TestPsicologico("Test 7", "Descripción del Test 7", "07-01-2023"),
        TestPsicologico("Test 8", "Descripción del Test 8", "08-01-2023"),
        TestPsicologico("Test 9", "Descripción del Test 9", "09-01-2023"),
        TestPsicologico("Test 10", "Descripción del Test 10", "10-01-2023")
    )

    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)) {
        items(tests) { test ->
            TestCard(test)
        }
    }
}

@Composable
fun TestCard(test: TestPsicologico) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp),
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = test.titulo, style = MaterialTheme.typography.bodyLarge)
            Text(text = test.descripcion, style = MaterialTheme.typography.bodyLarge)
            Text(text = "Fecha de Publicación: ${test.fechaPublicacion}", style = MaterialTheme.typography.bodyLarge)
        }
    }
}