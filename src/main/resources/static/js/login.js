var vue = new vue({
    el:'',
    data:{
        username:'',
        password:''
    },
    method:{
        login(){
            axios.post('/api/login/goLogin', {
                firstName: username,
                lastName: password
            })
                .then(function (response) {
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
});