# th logic is to count total number of 0's, 1's and 2's int the list and starting from beginning first append total 0's then total 1's and then 2's
def sort012(li, n): 
    count1 = 0
    count2 = 0
    count3 = 0
    for i in range(n): 
        if li[i] == 0: 
            count1 += 1
          
        elif li[i] == 1: 
            count2 += 1
        else:
            count3 += 1
      
 
    i = 0
    while (count1 > 0): 
        li[i] = 0
        i+=1
        count1 -= 1
    while (count2 > 0): 
        li[i] = 1
        i+=1
        count2 -= 1
    while (count3 > 0): 
        li[i] = 2
        i+=1
        count3 -= 1

    print(li) 
  
li012 = [1,0,2,1,0,0,1,2] 
n = len(li012) 
  
sort012(li012, n) 
