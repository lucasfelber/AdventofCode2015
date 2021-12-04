package solution

import util.getInputAsIntArray
import util.getInputAsText

private fun level1(): Int = getInputAsText(1).fold(0){acc, c -> if(c == '(') acc+1 else acc-1}

private fun level2(): Int{
    val input = getInputAsText(1)
    var counter = 0
    for(i in input.indices){
        if(input[i] == '('){
            counter++
        }else{
            counter--
        }
        if(counter < 0){
            return i + 1
        }
    }
    return 0
}

fun main(){
    //println(level1())
    println(level2())
}