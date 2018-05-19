<template>
  <div class="container">
    <div class="pb-2 mt-4 mb-2 border-bottom">
      <h1 v-text="`${algorithm.name}の問題一覧`"></h1>
      <table class="table table-hover">
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
  </div>
</template>

<script>
import axios from 'axios'

export default {
  async asyncData ({query}) {
    const algorithm_id = query.algorithm_id
    const task_params = {
      algorithm_id
    }
    const algorithm_params = {
      algorithm_id
    }
    const [tasks, algorithm] = await Promise.all([
      axios.get("http://localhost:8080/tasks", {params: task_params}),
      axios.get("http://localhost:8080/algorithms", {params: {algorithm_id: 0}})
    ])
      .then((responses) => responses.map((({data}) => data)))
    return {
      tasks,
      algorithm
    }
  },
  methods: {
    open(url) {
      window.open(url)
    }
  }
}
</script>

