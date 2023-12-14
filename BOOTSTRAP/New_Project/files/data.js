function submitForm() {
    // Get values from the form
    var username = document.getElementById("userName").value;
    var password = document.getElementById("password").value;


    var table= document.getElementById("userData");
    if(table){
      var row = table.insertRow(1);

      var cell1 = row.insertCell(0);
      var cell2 = row.insertCell(1);

      cell1.innerHTML = username;
      cell2.innerHTML = password;

      document.getElementById("LoginForm").reset();

    } else{
      console.error("error");
    }

  }


  