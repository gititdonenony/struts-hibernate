<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<html:html>

<head>
	<title>Add user</title>
</head>
<body>
	<html:form method="post" action="/adduser">
		<table>
			<tr>
				<th>
					First Name
				</th>
				<td>
					<html:text property="firstName"></html:text>
				</td>

			</tr>
			<tr>
				<th>
					Last Name
				</th>
				<td>
					<html:text property="lastName"></html:text>
				</td>
			</tr>
			<tr>
				<th>
					Email ID
				</th>
				<td>
					<html:text property="emailId"></html:text>
				</td>
			</tr>
			<tr>
				<th>
					Mobile Number
				</th>
				<td>
					<html:text property="mobileNumber"></html:text>
				</td>
			</tr>
			<tr>
				<th>
					Password
				</th>
				<td>
					<html:text property="passWord"></html:text>
				</td>
			</tr>
			<tr>
				<th>
					Date of Birth
				</th>
				<td>
					<html:text property="dob"></html:text>
				</td>
			</tr>
			<td colspan=2>
				<html:submit>Add user</html:submit>
			</td>

		</table>

	</html:form>
</body>

</html:html>