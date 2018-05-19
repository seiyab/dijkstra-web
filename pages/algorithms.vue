<template>
  <div class="container">
    <div class="pb-2 mt-4 mb-2 border-bottom">
      <h1>アルゴリズムから問題を探す</h1>
    </div>
    <div class="list-group">
      <a
        v-for="algorithm in algorithms"
        class="list-group-item col-md-4 col-sm-6 col-xs-12"
        v-bind:href="'/serp_task?algorithm_id=' + algorithm.algorithm_id"
        v-text="algorithm.name">
        アルゴリズム
      </a>
    </div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  async asyncData () {
    const algorithms = await axios.get('http://localhost:8080/algorithms/list').then(({data}) => data)
    return {
      algorithms
    }
  }
}
</script>

