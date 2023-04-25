import java.util.ArrayList;
import java.util.List;

public class MajorAppliance extends HomeAppliance{

    public List<String> getMajorApplianceKeyWords(){
        List<String> keywords = new ArrayList<>();
        keywords.add("parameter");
        keywords.add("void");
        return keywords;
    }

    public boolean find(String keyword){
        if (this.getMajorApplianceKeyWords().contains(keyword) || super.find(keyword)){
            return true;
        }else {
            return false;
        }
    }
}
