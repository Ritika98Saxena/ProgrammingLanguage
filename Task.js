//Prob. Write a program in Java Script that will take shocks array as input and returns number of pairs for every unique color.
//Output Format-->Return the total number of matching pairs of socks that Rohit can sell. 


//Please find the logic below of this question.

function colour(sock){
  sock.sort(function(a,b){
var counter=0;
for(var i=0; i<sock.length-1; i++){
if (sock[i]==sock[i+1]){
counter++
i++
}
}
return counter;
}
}