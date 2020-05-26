<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<!-- HeaderTile.jsp BEGIN -->
<span style="float:right">
	<img style="border:0;" src="<%=request.getContextPath()%>/images/qwest_logo.gif"/>
</span>
<span class="work-title">
	<tiles:getAsString name="title"/>
</span>
<!-- HeaderTile.jsp END -->
