def someMethod() {
  def myList = [1, 2, 3, 4, 5]
  def iterator = myList.iterator()
  while (iterator.hasNext()) {
    def item = iterator.next()
    if (item == 3) {
      iterator.remove()
    }
  }
  println myList
}
someMethod()