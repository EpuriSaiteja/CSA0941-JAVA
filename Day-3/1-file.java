import java.io.*;
class sampleFile {
    public static void main(string[] args){
        try {
            Filewriter writer = new Filewriter("sample.txt");
            writer.write("i wrote in the above file");
            wrte.close();
            system.out.println("writing work done");
        }
        catch(Exception e)
        {
            system.out.println(e);
        }

    }
}