var n=0; //size of the array
n = prompt("Enter the size of the array");
var arr = new Array(n); //declaring array
var flag=0;
for(var i=0;i<n;i++)
{
    arr[i] = prompt("Enter the " + i + " element");
}
var find = prompt("Enter the element to find");
for(var i=0;i<n;i++)
{
    if(find == arr[i])
    {
        flag=1;
        break;
    }
}
if(flag==1)
{
    document.write("Element found!!!");
}
else if(flag==0)
{
    document.write("Element not Found");
}