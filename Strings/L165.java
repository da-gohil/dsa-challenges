public class L165 {
    public int compareVersion(String version1, String version2) {
       
        //Step01) Get the String splitted back to the an array form for easy comparison, index by index
        String[] v1Revisions = version1.split("\\.");
        String[] v2Revisions = version2.split("\\.");
        
        int maxLength = Math.max(v1Revisions.length, v2Revisions.length);
        
        for(int i=0; i< maxLength; i++){

            int v1 = (i < v1Revisions.length) ? Integer.parseInt(v1Revisions[i]):0;

            int v2 = (i < v2Revisions.length) ? Integer.parseInt(v2Revisions[i]):0;
            
            if(v1 < v2){
                return -1;
            }
            if (v1 > v2) {
                return 1;
            }
        }
        return 0;
    }
}