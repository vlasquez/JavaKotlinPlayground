import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class LanguageStudent {

    private Collection<String> languageList = new ArrayList<>();

    public Collection<String> getLanguages() {
        return languageList;
    }

    public void addLanguage(String language) {
        languageList.add(language);
    }

}

class LanguageTeacher extends LanguageStudent {

    public static void main(String[] args) {
        LanguageTeacher teacher = new LanguageTeacher();
        teacher.addLanguage("English");


        LanguageStudent student = new LanguageStudent();
        teacher.teach(student, "English");


        for (String language : student.getLanguages())
            System.out.println(language);
    }

    boolean teach(LanguageStudent student, String language) {
        if (this.getLanguages().contains(language)) {
            student.addLanguage(language);
            return true;
        } else {
            return false;
        }
    }
}

