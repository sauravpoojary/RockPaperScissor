<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Rock Paper Scissor</title>
</head>
<body>
<div class="container">
        <h1>ROCK PAPER SCISSOR</h1>

        <form method="post" action="check">
     <!-- <input type="text" name="name"/> -->   
        <h5>Enter your choice :-</h5>
        <h5>Select your option</h5>
            <input  type="radio" name="pick" id="rock" value="rock">
            <label  for="rock">
              Rock
            </label>
            <input type="radio" name="pick" id="paper" value="paper">
            <label  for="paper">
              Paper
            </label>
            <input  type="radio" name="pick" id="scissor" value="scissor" >
            <label  for="scissor">
              Scissor
            </label>
          <button type="submit" class="btn btn-primary">Submit</button>

        </form>

        
    </div>

</body>
</html>