$(document).ready(function() {
    
	$('#example').DataTable( {} );
	
	$('#example1').DataTable( {
        "ajax": "http://localhost:8989/AttendanceStudentInterface/admin/student/data",
        "columns": [
            { "data": "name" },
            { "data": "position" },
            { "data": "office" },
            { "data": "extn" },
            { "data": "start_date" },
            { "data": "salary",
                "orderable": false,
                "searchable": false,
                "render": function(data,type,row,meta) { // render event defines the markup of the cell text 
                    var a = '<a href="'+row.name+'"><i class="fa fa-edit"></i>  ' + data +'</a>'; // row object contains the row data
                    return a;
                }
            }
        ]
    } );
	
	$("button").click(function(){
		$.ajax({
			type : "POST",
			url : "http://localhost:8989/attendancemngt/student/datademo",
			data : JSON.stringify({
				"name" : "RITESH"
			}),
			headers: { 
					'Accept': 'application/json',
					'Content-Type': 'application/json' 
			},
			success : function(data) {
				if (data.status == 'OK')
					alert('Person has been added');
				else
					alert('Failed adding person: '
						+ data.status + ', '
						+ data.errorMessage);
			}
		});
    	});
	
});