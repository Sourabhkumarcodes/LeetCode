class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int pt=0;
        int arr[]=new int[s.length()];
        while(pt!=n){
        for(int i=0;i<n;i++){
            if(indices[i]==pt){
                arr[pt]=i;
                break;
            }
            }
        pt++;
        }
        for(int i=0;i<n;i++){
            sb.append(s.charAt(arr[i]));
        }
    return sb.toString();
    }
}