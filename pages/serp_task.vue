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
          <!--<th scope="col" class="col-xs-8 col-sm-4 col-md-3">コンテスト</th>
          <th scope="col" class="col-xs-4 col-sm-8 col-md-9">問題</th>-->
          <th scope="col" class="contest">コンテスト</th>
          <th scope="col" class="task">問題</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="task in tasks" @click="open(task.url)">
          <!--<td v-text="task.contest" class="col-xs-8 col-sm-4 col-md-3"></td>
          <td v-text="task.task" class="col-xs-4 col-sm-8 col-md-9"></td>-->
          <td v-text="task.contest" class="contest"></td>
          <td v-text="task.task" class="task"></td>
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

<style scoped>
/* Small devices (landscape phones, 576px and up) */
@media (min-width: 576px) {
  th.contest {
    width: 50%;
  }

  th.task {
    width: 50%;
  }
}

/* Medium devices (tablets, 768px and up) */
@media (min-width: 768px) {
  th.contest {
    width: 40%;
  }

  th.task {
    width: 60%;
  }
}

/* Large devices (desktops, 992px and up) */
@media (min-width: 992px) {
  th.contest {
    width: 30%;
  }

  th.task {
    width: 70%;
  }
}

/* Extra large devices (large desktops, 1200px and up) */
@media (min-width: 1200px) {
  th.contest {
    width: 25%;
  }

  th.task {
    width: 75%;
  }
}
</style>

