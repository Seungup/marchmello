import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

class Threads {
  constructor(title, description, id) {
    this.title = title;
    this.des = description;
    this.id = id;
  }
}

export default new Vuex.Store({
  state: {
    baseUrl: 'http://localhost:8080',

    docState: 'default',
    searchState : true,

    searchKeyword : '',
    searchTrigger : false,

    title: '',
    description: '',

    items : [
      new Threads(
        'lkjnlkjnthekjlthekjll ',
        'Foster thekjlthekjlthekjlthektthekjlthekjlthekjlthekjlhekjlthekjlthekjljlthekjlthekjlthekjl People',
        123
      ),
    ]
  },
  mutations: {
    setDocState (state, stateValue) {
      state.docState = stateValue
    },
    chageSearchState(state) {
      if (state.searchState === true){
        state.searchState = false
      } else {
        state.searchState = true
      }
    },
    setSearchKeyword(state, searchKeyword) {
      state.searchKeyword = searchKeyword
      state.searchTrigger = true
    },
    setSearchKeywordNull(state) {
      state.searchKeyword = null
      state.searchTrigger = false
    },
    setTitle(state, title) {
      state.title = title
    },
    setDescription(state, desc) {
      state.description = desc
    },
    postThread(state) {
      this.$http.post(
          "http://localhost:8080/threads/",
          `{
          'title': ${state.title},
          'description': ${state.description}
          }`
          ).then((result) =>{
            console.log(result)
            this.$store.commit('setDocState', 'logined')
      })
    }
  },
  actions: {
  },
  modules: {
  }
})
