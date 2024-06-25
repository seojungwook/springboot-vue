<template>
  <Com_Head/>
  <HelloWorld/>
  <Com_Footer/>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import Com_Head from './components/Com_Head.vue'
import Com_Footer from './components/Com_Footer.vue'

export default {
  name: 'App',
  components: {
    HelloWorld,
    Com_Head,
    Com_Footer
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
