<template>
  <div class="container">
    <div class="pb-2 mt-4 mb-2 border-bottom">
      <h1>アルゴリズムから問題を探す</h1>
    </div>
    <div class="row">
      <a
        v-for="algorithm in algorithms"
        class="card col-md-4 col-sm-6 col-xs-12 p-3"
        v-bind:href="'/serp_task?algorithm_id=' + algorithm.algorithm_id"
        v-text="algorithm.name">
        アルゴリズム
      </a>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import api from '~/config/api'

export default {
  async asyncData ({redirect}) {
    try {
      const algorithms = await axios.get(`${api.dijkstra.domain}${api.dijkstra.endpoint.algorithmList}`).then(({data}) => data)
      return {
        algorithms,
      }
    } catch(e) {
      redirect('/error')
    }
  }
}
</script>

<style>
a.card {
    color: #111111;
    text-decoration: none;
}

</style>
