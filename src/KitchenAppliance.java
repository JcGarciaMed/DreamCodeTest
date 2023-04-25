import java.util.ArrayList;
import java.util.List;

public class KitchenAppliance extends MajorAppliance{

    public List<String> getKitchenApplianceKeyWords(){
        List<String> keywords = new ArrayList<>();
        keywords.add("kitchen");
        keywords.add("garden");
        return keywords;
    }

    public boolean find(String keyword){
        if (this.getKitchenApplianceKeyWords().contains(keyword) || super.find(keyword)){
            return true;
        }else {
            return false;
        }

    }
}
