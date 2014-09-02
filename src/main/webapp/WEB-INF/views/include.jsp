<%@ page language="java" import="java.util.*"  contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%
	String commonPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; 
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">  
<script type="text/javascript">
	var commonPath = '<%=commonPath%>';
</script>
<base href="<%=commonPath%>"></base> 
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/pcyyd.css" />
<link rel="stylesheet" href="css/green/jquery-ui.min.css" />
<script src="js/jquery-1.9.0.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script src="js/jquery.date.js"></script>
<script src="js/jquery.js.js"></script>
<script src="js/Validform_v5.3.2_min.js"></script>
<!--[if ie 6]>
<script src="js/DD_belatedPNG.js"></script>
<script>
DD_belatedPNG.fix('.alert,.btn_submit');
</script>
<![endif]-->