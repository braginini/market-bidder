package ru.mbragin.marketbidder.controller.response;

import org.codehaus.jackson.annotate.JsonProperty;
import ru.mbragin.marketbidder.model.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mikhail Bragin
 */
public class LoadProjectResponse2 {

    @JsonProperty("")
    private List<List<String>> aaData;

    public LoadProjectResponse2() {
    }

    public LoadProjectResponse2(List<Project> rows) {
        this.aaData = new ArrayList<>(rows.size());
        for (Project p : rows) {
            List<String> list = new ArrayList<>();
            list.add(String.valueOf(p.getId()));
            list.add(String.valueOf(p.getTitle()));
            list.add(String.valueOf(p.getUrl()));
            list.add(String.valueOf(p.isDefaultProject()));
            aaData.add(list);
        }
    }

    public List<List<String>> getAaData() {
        return aaData;
    }
}
