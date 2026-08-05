class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int length=0;
        int wc=0;
        int start=0;
        List<String>  list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            length+=words[i].length();
            wc++;
            if(length+wc-1 >maxWidth){
                i--;
                text(words , maxWidth , list ,start , i, false);
                wc=0;
                length = 0;
                start =i+1;
            }
        }
        text(words , maxWidth , list ,start , words.length-1, true);
        return list;
    }
    public static void text(String words[] ,int  maxWidth ,List<String> list ,int start , int end, boolean lastline){
        if(lastline || start == end){
            StringBuilder ss= new StringBuilder();
            for(int i=start; i<=end ; i++){
                ss.append(words[i]);
                if(i!=end)ss.append(" ");
            }
            while(ss.length() < maxWidth){
                ss.append(" ");
            }
            list.add(ss.toString());
            return;
        }
        List<StringBuilder> temp= new ArrayList<>();
        int tc=0;
        for(int i=start ; i<= end ;i++){
            temp.add(new StringBuilder(words[i]));
            tc+= words[i].length();
        }
        int totalSpaces = maxWidth - tc;
        int ind=0;
        while(totalSpaces > 0){
            temp.get(ind).append(" ");
            ind++;
            totalSpaces--;
            if(ind == temp.size()-1)ind=0;
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder word : temp){
            sb.append(word);
        }
        list.add(sb.toString());
            }
}
