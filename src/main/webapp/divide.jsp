<!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
  	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

     
    <style>


		.subject-info-box-1,
.subject-info-box-2 {
    float: left;

    width: 45%;
    padding-left: 30px;
}



.subject-info-arrows {
    float: left;
    width: 5%;
    height: 100%;
    
    margin-top: 70px;
    input {
        width: 70%;
        margin-bottom: 5px;
    }
}
	#lstBox1, #lstBox2 {
	  
	}

    .vl {
        float: left;
        border-left: 2px solid;
        height: 100%;   
        }


.hl{
    border-bottom: 2px solid;
    width: 100%;
} 
.modal-body input{
    width: 110px;
}
option {
    padding-bottom: 10px;
	}
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="color: white;">

<ul class="navbar-nav">
<li class="nav-item"><h3 style="margin-left: 20px;">Sanjana</h3></li>
<li class="nav-item"><h3 style="margin-left: 600px;">DOB: 28/08/96</h3></li>
<li class="nav-item"><h3 style="margin-left: 300px;">Age: 22</h3></li>
</ul>
</nav>

<div class="subject-info-box-1">
	<h2>Home Medication</h2>
  <select multiple="multiple" id='lstBox1' class="form-control" style="height: 300px">
    <option value="Ajax hello boom disco jog lemo">Asprin Tablet Tablet Mouth 300mg Twice  </option>
   <!--  <option value="Jquery hello boom disco jog lemo">jQuery</option>
    <option value="Javascript hello boom disco jog lemo">JavaScript</option>
    <option value="Mootool hello boom disco jog lemo">MooTools</option>
    <option value="Prototype hello boom disco jog lemo">Prototype</option>
    <option value="Dojo hello boom disco jog lemo">Dojo</option> -->
  </select><br>
</div>
<div class="vl"></div>
<div class="subject-info-arrows text-center">
  <input type="button" id="btnAllRight" value=">>" class="btn btn-default" /><br />
  <input type="button" id="btnRight" value=">" class="btn btn-default" />
</div>
<div class="vl"></div>
<div class="subject-info-box-2">
    <h2>Discharge Medication</h2>
     <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">+</button>
     <button type="button" class="btn btn-primary" id="delete">Delete</button>
	<div style="padding: 5px;border: 1px solid;height:250px;margin-top: 5px;overflow-y: auto;" id="lstBox2" class="container-fluid">
     
   
    </div>
  <!-- <select id='lstBox2' class="form-control">
    <option value="asp">ASP.NET</option>
    <option value="c#">C#</option>
    <option value="vb">VB.NET</option>
    <option value="java">Java</option>
    <option value="php">PHP</option>
    <option value="python">Python</option>
  </select> -->
</div>
<div class="clearfix"></div>

<!-- <div class="hl"></div>
 -->  <!-- The Modal -->
  <div class="modal fade" id="myModal">
    <div class="modal-dialog modal-dialog-centered modal-xl">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Medicine</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
       <div class="modal-body">
          <form id="myForm">  
            <label for="category" class="control-label">Name:</label>
            <input type="text" id="name" name="name" placeholder="Name of medicine">&nbsp;&nbsp;
            <label for="make" class="control-label">Strength:</label>
            <input type="text" id="strength" name="strength" placeholder="Strength">&nbsp;&nbsp;
            <label for="model" class="control-label">Dose:</label>
            <input type="text" id="dose" name="dose" placeholder="Dose">&nbsp;&nbsp;
            <label for="model" class="control-label">From:</label>
            <input type="text" id="from" name="from" placeholder="Tablet or Syrup">&nbsp;&nbsp;
            <label for="model" class="control-label">Route:</label>
            <input type="text" id="route" name="route" placeholder="Nosal or Oral">&nbsp;&nbsp;
            <label for="model" class="control-label">Frequency:</label>
            <input type="text" id="freq" name="freq" placeholder="Frequency">
            <label for="model" class="control-label">Date From:</label>
            <input type="date" id="datefrom" name="datefrom" placeholder="Date From">
            <label for="model" class="control-label">Date To:</label>
            <input type="date" id="dateto" name="dateto" placeholder="Date To"><br><br>
            <input type="hidden" name="hid" id="hid">
            <button type="submit" class="btn btn-primary sub">Submit</button>
        </form>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>


<script>
    var i=0;
        
    $('#btnRight').click(function (e) {
        var selectedOpts = $('#lstBox1 option:selected').val();
        if (selectedOpts.length == 0) {
            alert("Nothing to move.");
            e.preventDefault();
        }
        console.log(selectedOpts);
        $('#lstBox2').show();
        var ctrl = "<div class='div'><label class='checkbox'    ><input type='checkbox' value='"+selectedOpts+"''>&nbsp;<p class='edit' style='display:inline' id='"+i+"' data-toggle='modal' data-target='#myModal'>"+selectedOpts+"</p></label><br><div>";
        $('#lstBox2').append(ctrl);
        i++;
        e.preventDefault();
    });

   
    $(document).on('click', '.edit', function(e){
      var f = $(this).text();
      var id = $(this).attr('id');
    console.log(f);
     var arr = f.split(' ');
     $('#name').val(arr[0]);
     $('#strength').val(arr[1]);
     $('#dose').val(arr[2]);
     $('#from').val(arr[3]);
     $('#route').val(arr[4]);
     $('#freq').val(arr[5]);
     $('#datefrom').val(arr[6]);
     $('#dateto').val(arr[7]);
     $('#hid').val(id);
     //console.log(arr);
     e.preventDefault();
    });


    $('#btnAllRight').click(function (e) {
        var s = [];
        $("#lstBox1 option").each(function()
            {
                s.push($(this).val());
                $('#lstBox2').show();
                var ctrl = "<div class='div'><label class='checkbox'><input type='checkbox' value='"+$(this).val()+"'>&nbsp;<p class='edit' style='display:inline' id='"+i+"' data-toggle='modal' data-target='#myModal'>"+$(this).val()+"</p></label><br></div>";
                
                $('#lstBox2').append(ctrl);
                i++;
            });
        
        console.log(s);
   
        e.preventDefault();
    });


    $("#delete").on("click", function() {
        //$( ".checkbox" ).closest( "br" ).remove();
      $(".div .checkbox input:checked").parent().parent().remove();
      
    });

    $(".sub").on("click", function(e) {
      var id = $('#hid').val();;
      var name = $('#name').val();
      var strength = $('#strength').val();
      var dose = $('#dose').val();
      var from = $('#from').val();
      var route = $('#route').val();
      var freq = $('#freq').val();
      var freq = $('#datefrom').val();
      var freq = $('#dateto').val();
      $('#'+id).text(name+' '+strength+' '+dose+' '+from+' '+route+' '+freq+' '+datefrom+' '+dateto);
      $('#myModal').modal('toggle');
      e.preventDefault();
    });


    $( "form" ).submit(function( event ) {
        $('#myModal').modal('toggle');
        var data = $( this ).serializeArray();
        console.log(data[0].value);
        //$("#lstBox2").html("<h1>"+data[0].value+"</h1>");
        var ct = "<div class='div'><label class='checkbox'><input type='checkbox' value='"+$(this).val()+"'>&nbsp;<p class='edit' style='display:inline' id='"+i+"' data-toggle='modal' data-target='#myModal'>"+data[0].value+" "+data[1].value+" "+data[2].value+" "+data[3].value+" "+data[4].value+" "+data[5].value+"</p></label><br></div>";
        $('#lstBox2').append(ct);
        i++;
        //$( "#inner" ).after(  );
        
        event.preventDefault();
});

	function show() {
		$('#med').show();
	}

	function add() {
		 var selectedOpts = $('#inp').val();
		 //alert(selectedOpts);
		 if (selectedOpts.length == 0) {
            alert("Nothing to move.");
            e.preventDefault();
        }
        $('#lstBox2').append(selectedOpts);
        $(selectedOpts).remove();
        e.preventDefault();
	}
</script>
<!-- Footer -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="color: white;margin-top: 181px;">
    <div style="margin-left: 800px;">
    <label>Status</label>
<select style="width: 150px;height: 30px;padding-bottom: 5px;">
    <option>In Progress</option>
    <option>Completed</option>
</select>
</div>
</nav>

  <!-- Footer -->
  </div>
  
</body>
</html>