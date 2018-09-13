n = int(input("Enter the size of the array\n"))
arr = [] #declared empty list

for i in range(n): #loop for input array
    a = input()
    arr.append(a)

search = int(input("Enter the element to search\n"))
flag = 0
for a in arr:
    if int(a) == search:
        flag = 1

if flag==1:
    print("Element found")
else:
    print("Element not found")