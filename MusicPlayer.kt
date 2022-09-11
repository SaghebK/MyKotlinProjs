class MusicPlayer {
    private var songs: Array<String> = arrayOf("As it was","Break My Soul",
    "Running Up That Hill","The Look", "Late Night Talking", "The Kind of Love We Make")
   
   fun songsize() {
        println( "Total Musics: " + songs.size +" Musics")
   }
   fun add() {
       
   }
    fun show(){
        songs.forEach(){
            item -> println(item)
        }
        println()
    }
    fun play(){
        
        println("Playing "+ songs[0])
    }
}
fun main(args: Array<String>) {
    val m = MusicPlayer()
    
    
    m.show()
    m.play()
    m.songsize()
    m.add()
}