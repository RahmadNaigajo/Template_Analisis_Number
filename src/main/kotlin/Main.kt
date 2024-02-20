package org.example

import com.numericalmethod.suanshu.matrix.doubles.matrixtype.dense.DenseMatrix
import com.numericalmethod.suanshu.matrix.doubles.operation.Inverse
import com.numericalmethod.suanshu.stats.random.univariate.normal.NormalRng
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.hr
import space.kscience.dataforge.meta.Value
import space.kscience.plotly.*
import space.kscience.plotly.models.*
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random


//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
//    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")

    //TIP click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    // To <b>Run</b> code, press <shortcut actionId="Run"/> or
    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    println("invert a Matrix")

//    val A = DenseMatrix(arrayOf(
//        doubleArrayOf(1.0, 2.0, 3.0),
//        doubleArrayOf(6.0, 5.0, 4.0),
//        doubleArrayOf(8.0, 7.0, 9.0)))
//    val Ainv = Inverse(A)
//    Ainv

    val Values = listOf(19, 26, 55)
    val Labels = listOf("Residential", "Non-Residential", "Utility")
    val colors = listOf("Red", "Blue", "Green")

// construct the trace of pie chart
    val pie = Pie {
        values = Values.map { Value.of(it) } // set data
        labels = Labels.map { Value.of(it) } // set data
        marker { pieColors = colors.map { Value.of(it) } } // set marker properties
        opacity = 0.7 // set opacity
    }

// plot the traces
    val plot = Plotly.plot {
        traces(pie) // supply traces

        layout { // set layout properties
            title = "Pie Chart"
            // set size
            height = 500
            width = 500
        }
    }

// display the plot
    plot.makeFile()

//    val x1 = (0..100).map { it.toDouble() / 100.0 }
//    val y1 = x1.map { sin(2.0 * PI * it) }
//    val y2 = x1.map { cos(2.0 * PI * it) }
//
//    val trace1 = Trace(x1, y1) { "sin" }
//    val trace2 = Trace(x1, y2) { "cos" }
//
//    Plotly.page { container ->
//        plot(renderer = container) {
//            traces(trace1, trace2)
//            layout {
//                title = "The plot above"
//                xaxis.title = "x axis name"
//                yaxis.title = "y axis name"
//            }
//        }
//        hr()
//        h1 { +"A custom separator" }
//        hr()
//        div {
//            plot {
//                traces(trace1, trace2)
//                layout {
//                    title = "The plot below"
//                    xaxis.title = "x axis name"
//                    yaxis.title = "y axis name"
//                }
//            }
//        }
//    }.makeFile()
}