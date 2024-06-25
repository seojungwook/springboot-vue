<template>
  <Com_Head/>
  <HelloWorld/>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import Com_Head from './components/Com_Head.vue'

export default {
  name: 'App',
  components: {
    HelloWorld,
    Com_Head
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
