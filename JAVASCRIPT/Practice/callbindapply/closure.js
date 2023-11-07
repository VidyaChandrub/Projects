const add = (function(){
    let counter = 0;
    console.log(function(){
        counter += 1;
        console.log(counter) ;
    })
})();

