<template>
  <div class="hello">
     <button @click="test11">test!</button>

  </div>
  
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  methods: {
    test11 :async function(){
      let url =`${location.origin}/data`;
      alert(url);
      await fetch(url)
        .then((res) => res.json()).then((data1) => {

          console.log(JSON.stringify(data1));
          alert('통신완료'+data1);

        }).catch((e) => {alert('error!!! >>>'+e)})
    }
  },
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
