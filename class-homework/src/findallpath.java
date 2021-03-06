import java.util.ArrayList;
import java.util.List;

public class findallpath {
    public List<String> binaryTreePaths(node root) {
        List<String> paths=new ArrayList<>();
        if(root==null)
        {
            return paths;
        }
        List<String> leftPaths=binaryTreePaths(root.left);
        List<String> rightPaths=binaryTreePaths(root.right);
        for(String path:leftPaths)
        {
            paths.add(root.value+"->"+path);
        }
        for(String path:rightPaths)
        {
            paths.add(root.value+"->"+path);
        }
        if(paths.size()==0){
            paths.add(""+root.value);
        }
        return paths;
    }

}
