package isp.lab5.exercise2;

interface Playable {
    void play();
}

class ColorVideo implements Playable {

    private String fileName;

    public ColorVideo(){

    }
    public ColorVideo(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    @Override
    public void play() {
        System.out.println("Play " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video..." + fileName);
    }
}


class ProxyVideo implements Playable {

    private Playable video;
    private VideoType videoType;
    private String fileName;


    public ProxyVideo(String fileName,VideoType videoType){
        this.fileName = fileName;
        this.videoType=videoType;

    }

    @Override
    public void play() {
        if (video == null) {
            switch (videoType) {
                case COLOR:
                    video = new ColorVideo(fileName);
                    break;
                case BLACKANDWHITE:
                    video = new BlackAndWhiteVideo(fileName);
                    break;
                default:
                    System.out.println("No Playable implementation found for type: " + videoType);
                    return;
            }
        }
        video.play();
    }
}

class BlackAndWhiteVideo implements Playable{
    private String fileName;

    public BlackAndWhiteVideo(String filename){
        this.fileName=filename;
    }
    @Override
    public void play() {
        System.out.println("Play black and white video { " + this.fileName+" }");
    }

}

public class Exercise2 {
    public static void main(String[] args){
        Playable yourChoice = new ProxyVideo("The Lucky One", VideoType.COLOR);
        yourChoice.play();

        Playable anotherChoice = new ProxyVideo("Titanic", VideoType.BLACKANDWHITE);
        anotherChoice.play();

    }
}
