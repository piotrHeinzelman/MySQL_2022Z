

function editProduct( codeId  ){
	myString = ""+location;
	myString = myString.split("/edit")[0];
	myString = myString + "/edit/item/" + codeId + "/1";
    window.open( myString,"");
}




function editProductOLD( codeId, langId  ){
	myString = ""+location;
	myString = myString.split("/edit")[0];
	myString = myString + "/edit/item/" + codeId + "/" + langId  ;
    window.open( myString,"");
}



function findCodeIdByStringLIKE( inp ){
    if ( inp.value.length < 2 ) return;

	//inp = document.getElementById("codeId");
    sel = document.getElementById("childrenId");

    let string = inp.value;
    // /edit/table_child/getChildsLikeString/{codeString}

    let request = new XMLHttpRequest();
    let url = '/edit/table_child/getChildsLikeString/'+string;
    request.open('GET', url);
    request.responseType = 'text';



    request.onload = function() {

        while ( sel.firstChild ) {  sel.removeChild( sel.firstChild )  }
        var items = request.response.split('|');

        items.forEach(function(item){

            var option = document.createElement('option');
            option.value = item.split("!")[0];
            option.text = item.split("!")[1];
            //sel.style.display = 'block';
            sel.appendChild(option);
       });
       //	inp.style.display = 'none';
       	sel.focus();
	}
    request.send();

}














function labelToCombo( me, selId ){

     url = '/dict/combo/' + me.getAttribute("dictName");
       if ( selId != null) { url += '/' + selId; }

   	span = me;
   	div = me.parentElement;
       parentDiv = div.parentElement;
   	label = div.getElementsByTagName("label")[0];


       newTag  = document.createElement("select");

       newTag.setAttribute( "id", label.getAttribute("id") );
       newTag.setAttribute( "name", label.getAttribute("name"));

       parentDiv.insertBefore( newTag, div );
       parentDiv.removeChild( div );

    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            // Typical action to be performed when the document is ready:

                newTag.innerHTML = xhttp.responseText;
        }
    };
    xhttp.open("GET", url , true);
    xhttp.send();
}






function copyPLToTable( me ){
	brotherSpan = me; //.parentElement.getElementsByTagName("span")[1];
	text = brotherSpan.innerHTML

	row = me.parentElement.parentElement;
	inp = row.getElementsByTagName("input")[0];
	inp.value = text;
}

function copyPLToTableMass(){
	ary = document.getElementsByClassName("copy_pl_to_table");
	for ( i = 0 ; i < ary.length ; i++ ){
	  item = ary[i];
	  copyPLToTable( item );
	}
}
















function addIChild( me ){

	var parentTH = me.parentElement;
   	var inp = parentTH.getElementsByClassName("c_input")[0];
	var c_span = parentTH.getElementsByClassName("c_span")[0];
	var ca = parentTH.getElementsByClassName("addIChild")[0];
	var cb = parentTH.getElementsByClassName("addTChild")[0];

	var s = "/indd/cil/add/" + inp.getAttribute("some");

	inp.setAttribute( "tgt" , s );

	inp.style.opacity = 100;
	c_span.style.opacity = 100;
	ca.style.opacity = 0;
	cb.style.opacity = 0;

}

function addTChild( me ){

	var parentTH = me.parentElement;
   	var inp = parentTH.getElementsByClassName("c_input")[0];
	var c_span = parentTH.getElementsByClassName("c_span")[0];
	var ca = parentTH.getElementsByClassName("addIChild")[0];
	var cb = parentTH.getElementsByClassName("addTChild")[0];

	var s = "/indd/cit/add/" + inp.getAttribute("some");

	inp.setAttribute( "tgt" , s );

	inp.style.opacity = 100;
	c_span.style.opacity = 100;
	ca.style.opacity = 0;
	cb.style.opacity = 0;

}

function sendChild( me ){
	var parentTH = me.parentElement;
   	var inp = parentTH.getElementsByClassName("c_input")[0];
	var c_span = parentTH.getElementsByClassName("c_span")[0];
	var ca = parentTH.getElementsByClassName("addIChild")[0];
	var cb = parentTH.getElementsByClassName("addTChild")[0];

		var s =  inp.getAttribute("tgt") + "/"+inp.value+"/";

        let xhttp = new XMLHttpRequest();

          if (this.readyState == 4 && this.status == 200) {
                  var a=1;
                }

        xhttp.open("GET", s , true);
        xhttp.send();


    	inp.style.opacity = 0;
    	c_span.style.opacity = 0;
    	ca.style.opacity = 100;
    	cb.style.opacity = 100;
        location.reload();

}



function removeTChild( parentId ){

		var s =  "/indd/cit/delete/"+parentId ;
        let xhttp = new XMLHttpRequest();
        xhttp.open("GET", s );
        xhttp.send();
        location.reload();
}


function removeIChild( parentId  ){

		var s =  "/indd/cil/delete/"+parentId;
        let xhttp = new XMLHttpRequest();
        xhttp.open("GET", s );
        xhttp.send();

        location.reload();
}