package assemble;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexUser {
    /*定义ComplexUser类的属性*/
    private  String uname;
    private List<String> hobbyList;
    private Map<String,String> residenceMap;
    private Set<String> aliasSet;
    private String[] array;
/*无参构造*/
    public ComplexUser() {
    }
/*有参构造*/
    public ComplexUser(String uname, List<String> hobbyList, Map<String, String> residenceMap, Set<String> aliasSet, String[] array) {
        this.uname = uname;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
        this.array = array;
    }
/*属性的setter方法*/
    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void setResidenceMap(Map<String, String> residenceMap) {
        this.residenceMap = residenceMap;
    }

    public void setAliasSet(Set<String> aliasSet) {
        this.aliasSet = aliasSet;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
/*重写toString方法*/
    @Override
    public String toString() {
        return "ComplexUser{" +
                "uname='" + uname + '\'' +
                ", hobbyList=" + hobbyList +
                ", residenceMap=" + residenceMap +
                ", aliasSet=" + aliasSet +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
