
<!DOCTYPE html>
<html>
<head>

    <title>Create Location</title>
</head>

<body>

    <form action="saveLoc" method="POST">
            <pre>
            Id: <input type="text" name="id"/>
            Code: <input type="text" name="code"/>
            Name: <input type="text" name="name"/>
            Type: Urban<input type="radio" name="type" value="Urban"/>
                  Rural<input type="radio" name="type" value="Rural"/>
            <input type="submit" value="save"/>
            </pre>
        </form>
    ${msg}

    <a href='viewLocations'>View all locations</a>
</body>
</html>