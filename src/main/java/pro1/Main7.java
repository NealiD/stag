package pro1;

import com.google.gson.Gson;
import pro1.apiDataModel.ActionsList;

import java.util.Objects;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {
        System.out.println(specializationDeadlines(2025));
    }

    public static String specializationDeadlines(int year){
        String json = Api.getSpecializations(year);
        ActionsList actions= new Gson().fromJson(json, ActionsList.class);
        return actions.items.stream().filter(a -> a.deadline=deadline);
    }


}

