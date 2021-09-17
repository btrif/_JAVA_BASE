package RunPython;

//  Created by BTrif Trif on 04-06-2020 , 10:11 AM.


import javax.script.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URL;

public class ExecutePython {

    public static void main(String[] args) throws ScriptException, IOException {

        StringWriter writer = new StringWriter(); //ouput will be stored here

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptContext context = new SimpleScriptContext();

        context.setWriter(writer); //configures output redirection
        ScriptEngine engine = manager.getEngineByName("python");



//        URL url = ExecutePython.class.getResource("numbers.py");
//        File file = new File(url.getPath());



        File directory = new File("./");

        File resourceFile = new File("numbers.py");

        System.out.println(directory.getAbsolutePath()  );
        System.out.println(resourceFile.getAbsolutePath()  );

        String py_file="c:\\GD\\COMPUTING & PROGRAMMING\\Java_dev_repo\\src\\RunPython\\numbers.py" ;
        System.out.println(py_file );

//        engine.eval(new FileReader( resourceFile.getAbsoluteFile() ), context);
        engine.eval(py_file );

        System.out.println(writer.toString());
    }


}
