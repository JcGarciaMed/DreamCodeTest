import java.util.ArrayList;
import java.util.List;

public class HomeAppliance extends Category{

    public List<String> getHomeApplianceKeyWords(){
        List<String> keywords = new ArrayList<>();
        keywords.add("Voltage");
        keywords.add("Weight");
        return keywords;
    }

    public boolean find(String keyboard){
        return this.getHomeApplianceKeyWords().contains(keyboard);
    }

}
