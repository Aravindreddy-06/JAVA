class TeluguSongs{
    void play(){
        System.out.println("Playing Telugu Song.");
    }
}
class HindiSongs{
    void play(){
        System.out.println("Playing Hindi Song.");
    }
}
class EnglishSongs{
    void play(){
        System.out.println("Playing English Song.");
    }
}


class music{
    TeluguSongs telugu = new TeluguSongs();
    HindiSongs hindi = new HindiSongs();
    EnglishSongs english = new EnglishSongs();

    void playTelugu(){
        telugu.play();
    }
    void playHindi(){
        hindi.play();
    }
    void playEnglish(){
        english.play();
    }
}

public class MultipleClass{
    public static void main(String args[]){
        music m = new music();

        m.playTelugu();
        m.playHindi();
        m.playEnglish();
    }
}