<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax Demo</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<link rel="stylesheet" href="css/styles.css"/>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-sm bg-primary ">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link text-white" href="#">Inquiry</a>
    </li>
    <li class="nav-item">
      <a class="nav-link text-white" href="#">Maintenance</a>
    </li>
    <li class="nav-item">
      <a class="nav-link text-white" href="#">Processing</a>
    </li>
     <li class="nav-item">
      <a class="nav-link text-white" href="#">Payment Inquiry</a>
    </li>
    <li class="nav-item">
      <a class="nav-link text-white" href="#">Reports</a>
    </li>
    <li class="nav-item">
      <a class="nav-link text-white" href="#">MAGIC 1.0</a>
    </li>
  </ul>
</nav>
<div class="container">
 <p class="font-weight-bold" align="center"> Affiliate :360 china/Hong Kong</p>

<p class="bg-info">Business Entity:China(Final Closing)<span style="width:40px;"></span>Bonus Period:102018<span></span></p>

<div id="accTopupFinalizationDiv">
<p class="bg-info">ACCL Top-Up Finalization</p>
<div class="row" style="padding-bottom: 40px;">
  <div class="col">Action:<button type="button" class="btn btn-primary active" id="finalTopupButton">Final Top-Up</button></div>
  <div class="col">Status:<strong>Not yet run</strong></div>
  <div class="col">Last Post:<strong>102018(2018/4/10 12:01:47)</strong></div>
</div>

</div>

<div id="accPrePaymentFinalizationDiv">
<p class="bg-info">ACCL Pre-payment finalization</p>
<div class="row"  style="padding-bottom: 40px;">
  <div class="col">Action:<button type="button" class="btn btn-primary active" id="finalPostButton">Final Post</button></div>
  <div class="col">Status:<strong>Not yet run</strong></div>
  <div class="col">Last Post:<strong>102018(2018/4/10 12:01:47)</strong></div>
</div>

</div>

<div id="buildLockDiv">
<p class="bg-secondary">Business Entity:China(Preliminary Closing)<span style="width:40px;"></span>Bonus Period:102018<span></span></p>

<p class="bg-secondary">Los<span style="width:40px;"></span>Bonus Period:102018<span></span></p>
<div class="row" style="padding-bottom: 40px;">
  <div class="col">Action:<button type="button" class="btn btn-primary active" id="finalBuildLockButton">Build & Lock</button></div>
  <div class="col">Status:<strong>Not yet locked down</strong></div>
  <div class="col">Previous Lockdown:<strong>102018(2018/4/10 12:01:47)</strong></div>
</div>
</div>

<div id="lockButtonDiv">
<p class="bg-secondary">Order/Return<span style="width:40px;"></span>Bonus Period:102018<span></span></p>

<div class="row" style="padding-bottom: 40px;">
  <div class="col">Action:<button type="button" class="btn btn-primary active" id="lockButton">Lock</button></div>
  <div class="col">Status:<strong>Not yet locked down</strong></div>
  <div class="col">Previous Lockdown:<strong>102018(2018/4/10 12:01:47)</strong></div>
   <div class="col">Action:<button type="button" class="btn btn-primary active">Transactions</button></div>
</div>
<div class="row" style="padding-bottom: 40px;">
  <div class="col"><button type="button" class="btn btn-primary active">Volume Validation</button></div>
  <div class="col">Status:<strong>Not yet locked down</strong></div>
  <div class="col">Last Run:<strong>102018(2018/4/10 12:01:47)</strong></div>
</div>
<div class="row" style="padding-bottom: 40px;">
  <div class="col"><button type="button" class="btn btn-primary active">Bonus Validation</button></div>
  <div class="col">Status:<strong>Not yet locked down</strong></div>
  <div class="col">Last Run:<strong>102018(2018/4/10 12:01:47)</strong></div>
</div>

</div>


</div>

</body>
</html>