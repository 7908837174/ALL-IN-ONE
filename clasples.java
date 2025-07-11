import java.util.*;
public class clasples {
    val input=0;
    var square:Int = 10;

    lateinit var firstNmae: String

    override fun onCreate(String);
    fun calculSquare() :Int {
        square = input*input;
        return square;
    }
    fun fatchSquare() : Int = input.input

    fun doSomething(): Unit{
        Log.i(TAG, msg:"doSomthing: NUTHING")
        return;
    }
}
import android.util.Log

class ClassExample {
    var input: Int = 0
    var square: Int = 10
    lateinit var firstName: String

    // onCreate should be part of an Android Activity or Fragment, but I'll omit it for simplicity
    // override fun onCreate(savedInstanceState: Bundle?) {
    //     super.onCreate(savedInstanceState)
    // }

    fun calculateSquare(): Int {
        square = input * input
        return square
    }

    fun fetchSquare(): Int {
        return square
    }

    fun doSomething() {
        Log.i("TAG", "doSomething: NOTHING")
    }
}
