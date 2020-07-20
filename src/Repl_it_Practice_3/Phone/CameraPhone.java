package Repl_it_Practice_3.Phone;

public class CameraPhone extends Phone{
    int imageSize;
    int memorySize;

    public CameraPhone(int imageSize, int memorySize){
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){
        return memorySize * 1000/imageSize;
    }




}