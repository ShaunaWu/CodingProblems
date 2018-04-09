/// <reference path="./typings/index.d.ts" />

function text(n)
{
    // write code here
    var res = 1;
    if(n == 1){
        console.log(1);
        return 1;
    }else if(n == 2){
        console.log(2);
        return 2;
    }else{
        for(var i = 2; i <= n; i++){
            res = res * addnum(i) % 987654321;
        }
    }       
    console.log(res);
    return res;
}

function is_prime(n){
    if(n==1){
        return true;
    }
    for(var i = 2 ; i < n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

function addnum(n){
    if(is_prime(n)){
        return n;
    }
    var tmp = n;
    for(var i = 2; i < n; i++){
        if(n % i == 0){
            while(tmp % i == 0){
                tmp /= i;
            }
            if(tmp == 1){
                return i;
            }else{
                return 1;
            }
        }
    }
    return 1;
}

text(100000);