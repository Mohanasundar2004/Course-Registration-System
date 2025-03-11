function showcourses(){
    fetch("http://localhost:8080/courses") //API end point
    .then((response)=>response.json())
    .then((courses)=>{
        const datatable=document.getElementById("coursetable");
        courses.forEach(course => {
            var row=`<tr>
            <td>${course.courseId}</td>
            <td>${course.coursename}</td>
            <td>${course.trainer}</td>
            <td>${course.durationInweek}</td>
            </tr>`
            datatable.innerHTML+=row; // datatable append for each row
        });
    })
}

function showenrolled(){
    fetch("http://localhost:8080/courses/enrolled")
    .then((response)=>response.json())  //http response into JSON format
    .then((enrolled)=>{
        const enroll=document.getElementById("enrolledtable");
        enrolled.forEach(enroller=>{
            var row=`<tr>
            <td>${enroller.username}</td>
            <td>${enroller.emailId}</td>
            <td>${enroller.coursename}</td>
            </tr>`
            enroll.innerHTML+=row;
        });
    })
}