class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<paths.size(); i++){
            set.add(paths.get(i).get(1));
        }
        for(int i=0; i<paths.size(); i++){
            if(set.contains(paths.get(i).get(0))){
                set.remove(paths.get(i).get(0));
            }
        }
        return set.iterator().next();
    }
}