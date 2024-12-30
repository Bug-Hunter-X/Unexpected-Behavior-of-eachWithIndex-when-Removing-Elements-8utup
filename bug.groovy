def someMethod() {
  def myList = [1, 2, 3, 4, 5]
  myList.eachWithIndex { item, index ->
    if (index == 2) {
      myList.remove(item)
    }
  }
  println myList
}
someMethod()