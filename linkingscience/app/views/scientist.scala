
<!DOCTYPE html>

<html>
    <head>
        <title>Linking Science!</title>
        <link rel="stylesheet" media="screen" href="@routes.Assets.at("stylesheets/main.css")">
        <link rel="stylesheet" media="screen" href="@routes.Assets.at("stylesheets/bootstrap.min.css")">
        <link rel="shortcut icon" type="image/png" href="@routes.Assets.at("images/favicon.png")">
        <script src="@routes.Assets.at("javascripts/jquery-1.9.0.min.js")" type="text/javascript"></script>
        <script src="@routes.Assets.at("javascripts/bootstrap.min.js")" type="text/javascript"></script>
    </head>
	

	
    <body>

	<style type="text/css">
         .btn {
                 padding-top: 5px;
                 margin-top: 5px;
         }
		 
		 #myCarousel{
		 height:200px;
		 width:800px;
		 }
 </style>
	
	
	
    <div class="container">
	
      <div class="navbar navbar-inverse">
         <a class="navbar-brand" href="/">Linking Science</a>
         <ul class="nav navbar-nav">
            <li><a href="../">Home</a></li>
            <li class="active"><a  href="../about/">About</a></li>
            <li><a href="#">The Team</a></li>
         </ul>
      <button type="button" class="btn btn-default navbar-btn pull-right"><a class="navbar-link" href="../sign-in/">Sign in</a></button>
      </div>


	  <div class="body-content">
	  
	   <div class="page-header">
	    	<center><h1 >Welcome scientist!</h1></center>
			<center><p>Let's start searching and exploring projects.</p></center>
	   </div>
	   
	   
	   <div class="row">
		 <div class="well">
		 <p>
		  As a <strong>scientist</strong> you can browse projects add comments and rank. You may also create your own scientific project and invite people to it. 
		  If you haven't created your account you need to <a href="#register">create it</a> and sign in.
		 </p>

		 </div>
		 
	   </div> <!-- /example -->
			
	<h3>Categories:</h3>
	</hr>
    <div class="row">
	  <div class="col-4 col-lg-4">
		  
		  <div class="panel panel-primary" >
			 <div class="panel-heading">
					 <h3 class="panel-title">Physics</h3>
			 </div>
             <a href="#" class="btn btn-primary">All physics</a>
             <a href="#" class="btn btn-primary">Particle physics</a>
             <a href="#" class="btn btn-primary">Quantum mechanics</a>
             <a href="#" class="btn btn-primary">Astrophysics</a>
          </div>
		  
		  
	  </div>
			
		<div class="col-4 col-lg-4">
		 <div class="panel panel-success" >
			 <div class="panel-heading">
					 <h3 class="panel-title">Biology</h3>
			 </div>
			 <a href="#" class="btn btn-success">All biology</a>
			 <a href="#" class="btn btn-success">Microbiology</a>
			 <a href="#" class="btn btn-success">Bioinformatics </a>
			 <a href="#" class="btn btn-success">Genetics </a>
			 </div>

		 </div>
			
			
		 <div class="col-4 col-lg-4">
            <div class="panel panel-warning" >
			   <div class="panel-heading">
					 <h3 class="panel-title">Social sciences</h3>
			   </div>
			   <a href="#" class="btn btn-warning">Economics</a>
			   <a href="#" class="btn btn-warning">Psychology</a>
			   <a href="#" class="btn btn-warning">Sociology</a>
			   <a href="#" class="btn btn-warning">History</a>
          </div>
	    </div>
	   
	   
	  </div>
			
	  <div class="row">	
			
		   <div class="col-4 col-lg-4">
				 <div class="panel panel-info" >
				 <div class="panel-heading">
						 <h3 class="panel-title">Formal sciences</h3>
				 </div>
				 <a href="#" class="btn btn-info">Mathematics</a>
				 <a href="#" class="btn btn-info">Logics</a>
			  </div>
		   </div>

	   
	   </div>
	   
</div>
	


 
	 
 <div class="footer">
	<p>&copy; Company 2013</p>
 </div>
</div> <!-- /container -->

 </body>
</html>