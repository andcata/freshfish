import java.io.*;
public class TestDataStream{
    public static void main(String[] args) throws IOException{

        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
        output.writeDouble(85.5);
        output.writeUTF("jim");
        output.writeDouble(185.5);
        output.close();

        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));

        System.out.println(input.readUTF() +" " +input.readDouble());
        System.out.println(input.readUTF() +" " +input.readDouble());
    }
}

