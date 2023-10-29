class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& arr) {
        vector<int> ans;
        int maxC = arr[0].size() - 1;
        int maxR = arr.size() - 1, cnt=0;
        int minR = 0, minC = 0;
        int tne = (maxC+1)*(maxR+1);
        while(cnt < tne){
            //top
            if(cnt < tne){   
                for(int i=minC; i<=maxC; i++){
                    ans.push_back(arr[minR][i]);
                    cnt++;
                }
            }
            minR++;
            //right
            if(cnt < tne){
                for(int i=minR; i<=maxR; i++){
                    ans.push_back(arr[i][maxC]);
                    cnt++;
                }
            }
            maxC--;
            //bottom
            if(cnt < tne){
                for(int i=maxC; i>=minC; i--){
                    ans.push_back(arr[maxR][i]);
                    cnt++;
                }
            }
            maxR--;
            //left
            if(cnt < tne){
                for(int i=maxR; i>=minR; i--){
                    ans.push_back(arr[i][minC]);
                    cnt++;
                }
            }
            minC++;
        }
        return ans;
    }
};