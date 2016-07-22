<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    
    <title>發帖</title>

  </head>
  
  <body>
      <center>
          <form action="doPost" method="post">
               <table>
                  <tr>
                        <td>主旨：</td>
                        <td><textarea rows="2" cols="30" name="postTitle"></textarea></td>  
                  </tr>
                  <tr>
                      <td>內容：</td>
                      <td><textarea rows="5" cols="60" name="postContent"></textarea>   </td>  
                  </tr>
                  <tr>
                      <td colspan="2" align="center"><input type="submit" value="發表">  </td>
                  </tr>
               </table>  
          </form>
      </center>
  </body>
</html>
