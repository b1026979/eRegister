
<html>
  <body>
    This is listActiveClasses::listActiveClasses.gsp</br>
      <table>
      <thead>
        <tr>
           <td><strong>Classes</strong></td>
        </tr>
      </thead>
        <tbody>
          <g:each in = "${allClasses}" var = "c">
           <tr>
            <td>${c.name}</td>

        </tr>
          </g:each>
        </tbody>
      </table>
  </body>
</html>
