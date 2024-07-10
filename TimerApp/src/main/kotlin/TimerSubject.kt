interface TimerSubject {
    fun subscribe(observer: TimerObserver)
    fun unsubscribe(observer: TimerObserver)
    fun notifyObservers()
}