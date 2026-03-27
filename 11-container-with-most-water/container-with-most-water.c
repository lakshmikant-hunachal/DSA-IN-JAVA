/*int maxArea(int* height, int heightSize) {
    int maxsize=0;
    if(heightSize==0)
    {
        return 0;
    }
    for(int i=0;i<heightSize;i++)
    {
        for(int j=i+1;j<heightSize;j++)
        {
            int mul=0;
          if(height[i]>height[j])
          {
             mul=height[j];
          }
          else
          {
            mul=height[i];
          }
           int size=mul*(j-i);
           if(maxsize<size)
           {
            maxsize=size;
           }
        }
    }
    return maxsize;
}*/
//optimal approch
int maxArea(int* height, int heightSize) {
    int maxsize=0;
    if(heightSize==0)
    {
        return 0;
    }
    int lp=0;
    int ep=heightSize-1;
    while(lp<ep)
    {
        int w=ep-lp;
        int mul=0;
          if(height[lp]>height[ep])
          {
             mul=height[ep];
          }
          else
          {
            mul=height[lp];
          }
        int size=w*mul;
        if(maxsize<size)
           {
            maxsize=size;
           }
        height[lp]<height[ep]?lp++:ep--;
    }
return maxsize;
}