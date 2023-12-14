
// window.localStorage.setItem("name","Vidya");



// window.localStorage.getItem(name);

function fetchData(url){
    return fetch(url).then(response => {
        return response.json();
    }).catch(error => {
        console.log("error")
    })
}

function storeDataLocal(key, value){
    try{
        var stringdata = JSON.stringify();
        localStorage.setItem(key, stringdata);
        console.log("success");
    }
    catch(error){
        console.log(error);
    }
}

const apiurl='https://jsonplaceholder.typicode.com/todos/1';
const localstoragekey = 'mydata';

fetchData(apiurl).then(data => storeDataLocal(localstoragekey, data));