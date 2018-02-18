import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomService {
    public List<String> getSections(){
        List<String> sectionList=new ArrayList<>();
        File mainDir=new File("C:\\Users\\Alex\\IdeaProjects\\SOAP_GUI_APP\\JsReference");
        for(File file: Objects.requireNonNull(mainDir.listFiles()))
            sectionList.add(file.getName());
        return sectionList;
    }
}