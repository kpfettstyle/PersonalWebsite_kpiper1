<doctype html>
<head>
<title>Error  Page</title>
</head>
<body>
	<h1>Error!</h1>
	<p>Houston, we've had a problem.</p>
	<p>To continue, click the back button.</p>
	
	<h2>Error Details</h2>
	<p>Type: ${pageContext.exception["class""]}</p>
	<p>Message: ${pagecontext.exception.message}</p>
</body>
</html>