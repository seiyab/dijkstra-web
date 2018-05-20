<template>
  <div class="container">
    <div class="pb-2 mt-4 mb-2 border-bottom">
      <h1 v-text="`${algorithm.name}の問題一覧`"></h1>
    </div>
    <div v-if="tasks.length === 0" class="alert alert-info">
      <span v-text="`${algorithm.name}の問題はまだ登録されていません。`"></span>
      <a href="/algorithms">アルゴリズム一覧に戻る</a>
      </div>
    <table v-if="tasks.length > 0" class="table table-hover">
      <thead>
        <tr>
          <th scope="col">コンテスト</th>
          <th scope="col">問題</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="task in tasks" @click="open(task.url)">
          <td v-text="task.contest"></td>
          <td v-text="task.task"></td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios'
import api from '~/config/api'

export default {
  async asyncData ({query, redirect}) {
    try {
      const algorithm_id = query.algorithm_id
      const task_params = {
        algorithm_id
      }
      const algorithm_params = {
        algorithm_id
      }
      const [tasks, algorithm] = await Promise.all([
        axios.get(`${api.dijkstra.domain}${api.dijkstra.endpoint.tasks}`, {params: task_params}),
        axios.get(`${api.dijkstra.domain}${api.dijkstra.endpoint.algorithm}`, {params: algorithm_params})
      ])
        .then((responses) => responses.map((({data}) => data)))
      return {
        tasks,
        algorithm
      }
    } catch(e) {
      redirect('/error')
    }
  },
  methods: {
    open(url) {
      window.open(url)
    }
  }
}
</script>

