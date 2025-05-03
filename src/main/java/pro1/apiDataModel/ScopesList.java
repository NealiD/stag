package pro1.apiDataModel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ScopesList {
    @SerializedName("prijimaciObor")
    public List<Scope> items;

    public void sortByDeadline() {
        this.items.sort(new Comparator<Scope>() {
            public int compare(Scope s1, Scope s2) {
                return s1.deadline.getDate().compareTo(s2.deadline.getDate());
            }
        });
    }

    private static ArrayList<String> uniqueStrings(ArrayList<String> dates) {
        return new ArrayList<String>(new HashSet<String>(dates));
    }

    public void uniqueScopes() {
        ArrayList<String> uniqueDates = uniqueStrings(this.getScopesFormated());

        this.items.clear();

        for (String date : uniqueDates) {
            Scope scope = new Scope();
            scope.deadline = new Deadline();
            scope.deadline.value = date;

            this.items.add(scope);
        }
    }

    public ArrayList<String> getScopesFormated() {
        ArrayList<String> dates = new ArrayList<String>();

        for (Scope scope : this.items) {
            dates.add(scope.deadline.value);
        }
        return dates;
    }
}