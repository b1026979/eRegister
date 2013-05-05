
<html>
  <body>
    This is classes::index.gsp</br>
      <table>
      <thead>
        <tr>
           <td><strong>Course name</strong></td>
           <td><strong>Class name</strong></td>
           <td><strong>Instructor</strong></td>
        </tr>
      </thead>
        <tbody>
          <g:each in = "${classList}" var = "c">
           <tr>
            <td><g:link controller= "Course" action="show" id="${c.courseName.id}">${c.courseName.courseName}</g:link></td>
            <td>${c.className}</td>
            <td><g:link controller= "Instructor" action="show" id="${c.regSheetNumber}">${c.instructorName.name} </g:link></td>
           </tr>
          </g:each>
        </tbody>
      </table>
  </body>
</html>
