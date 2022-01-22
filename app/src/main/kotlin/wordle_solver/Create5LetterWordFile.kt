package wordle_solver

import java.io.File

fun createFileOfOnly5LetterWords() {
  val fileName = "five_letter_words.txt"
  val fiveLetterWordsFile = File(fileName)
  // create a new file
  val isNewFileCreated = fiveLetterWordsFile.createNewFile()
  if(!isNewFileCreated){
    println("$fileName already exists")
    return
  }
  val allWordsFileName = "words_alpha.txt"
  val lines = File(allWordsFileName).readLines()
  lines
    .filter { it.length == 5 }
    .forEach { fiveLetterWordsFile.appendText(it + "\n") }

}

fun main(args: Array<String>) {
  createFileOfOnly5LetterWords()
}