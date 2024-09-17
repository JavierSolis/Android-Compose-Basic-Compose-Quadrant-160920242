# Courses Android Compose Basic - Solution Code

---

Solution code for the Android Basics with Compose: Compose Quadrant

Exercise source: https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-composables-practice-problems#3

# Description

------------


## [4\. Cuadrante de Compose](https://developer.android.com/codelabs/basic-android-kotlin-compose-composables-practice-problems?hl=es-419&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%3Fhl%3Des-419%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-composables-practice-problems#3)

En este ejercicio, deberás aplicar la mayoría de los conceptos que aprendiste hasta ahora y, luego, avanzar un paso más para explorar un nuevo `Modifier` y sus propiedades. Esto puede parecer un desafío adicional, pero no te preocupes. Puedes consultar la sección Referencias para este problema, en la que encontrarás los vínculos a estas clases de `Modifier` y sus propiedades, que podrás usar para la implementación.

Debes compilar una app que muestre la información acerca de las funciones `Composable` que aprendiste.

La pantalla se divide en cuatro cuadrantes. Cada uno proporciona el nombre de una función `Composable` y la describe en una oración.

### Captura de pantalla final

Cuando termines la implementación, tu diseño debería coincidir con esta captura de pantalla:

![c0c70117bbd3b5b5.png](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-composables-practice-problems/img/c0c70117bbd3b5b5.png?hl=es-419)

### Especificaciones de IU

Sigue estas especificaciones de IU para toda la pantalla:

-   Divide toda la pantalla en cuatro partes iguales, cada una de las cuales contendrá una tarjeta de Compose y mostrará información sobre una función `Composable`.

![5b11c91ad6a356eb.png](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-composables-practice-problems/img/5b11c91ad6a356eb.png?hl=es-419)

Sigue estas especificaciones para cada cuadrante:

![e6befaa575985819.png](https://developer.android.com/static/codelabs/basic-android-kotlin-compose-composables-practice-problems/img/e6befaa575985819.png?hl=es-419)

1.  Configura todo el cuadrante (inicio, fin, parte superior y parte inferior) con un padding de `16dp`.
2.  Aplica una alineación central a todo el contenido en dirección vertical y horizontal en cada cuadrante.
3.  Aplica en el primer elemento `Text` que admite composición un formato de negrita y configúralo con un padding inferior de `16dp`.
4.  Configura el segundo elemento `Text` componible con un tamaño de fuente `Default`.

### Recursos

Estos colores:

-   `Color(0xFFEADDFF)`
-   `Color(0xFFD0BCFF)`
-   `Color(0xFFB69DF8)`
-   `Color(0xFFF6EDFF)`

Estas strings:

-   `Text composable`
-   `Displays text and follows the recommended Material Design guidelines.`
-   `Image composable`
-   `Creates a composable that lays out and draws a given Painter class object.`
-   `Row composable`
-   `A layout composable that places its children in a horizontal sequence.`
-   `Column composable`
-   `A layout composable that places its children in a vertical sequence.`

### Referencias

-   Función [`Weight modifier`](https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/RowScope?hl=es-419#\(androidx.compose.ui.Modifier\).weight\(kotlin.Float,kotlin.Boolean\))
-   Propiedad [`FontWeight.Bold`](https://developer.android.com/reference/kotlin/androidx/compose/ui/text/font/FontWeight?hl=es-419#Bold\(\))
-   Propiedad [`TextAlign.Justify`](https://developer.android.com/reference/kotlin/androidx/compose/ui/text/style/TextAlign?hl=es-419#Justify\(\))