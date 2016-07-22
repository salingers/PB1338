<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>JSTL簡單案例</title>
  </head>
  
  <body>
  <form action="EL.jsp" method="post">
            <table width="752" height="367" border="1">
  <tr>
    <td width="71">姓名：</td>
    <td width="252"><label for="textfield"></label>
    <input type="text" name="name" id="textfield" /></td>
  </tr>
  <tr>
    <td>性別：</td>
    <td><input type="radio" name="sex" id="radio" value="男" />
    <label for="radio">
      男
        <input type="radio" name="sex" id="radio2" value="女" />
    女</label></td>
  </tr>
  <tr>
    <td>年齡：</td>
    <td><label for="textfield2"></label>
    <input name="age" type="text" id="textfield2" size="5" /></td>
  </tr>
  <tr>
    <td>愛好：</td>
    <td><table width="526" height="90" border="0">
      <tr>
        <td width="116"><label>
          <input type="checkbox" name="interest" value=" 打籃球" id="interest_0" />
          打籃球</label>
          <br /></td>
        <td width="105"><input type="checkbox" name="interest" value="網上沖浪" id="interest_1" />
網上沖浪</td>
        <td width="68"><input type="checkbox" name="interest" value="旅游" id="interest_2" />
旅游</td>
        <td width="66"><input type="checkbox" name="interest" value="健身" id="interest_3" />
健身</td>
      </tr>
    </table>      <p><br />
    </p></td>
  </tr>
  <tr>
    <td colspan="2"><input type="submit" name="button" id="button" value="傳送" /></td>
  </tr>
</table>  
</form>     
  </body>
</html>
