import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)


export default new Vuex.Store({
  state: {
    // USER
    userNickname: '',
    userId: '',
    userPassword: '',

    // LINK
    baseUrl: 'http://localhost:8080/',


    // DOC
    docState: 'default',
    searchState : true,

    searchKeyword : '',
    searchTrigger : false,

    title: '',
    description: '',

    items : [{
      _embedded: {
        threads: [
        ]
      }
    }
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
    setUserId(state, id) {
      state.userId = id
    },
    setUserPassword(state, password) {
      state.userPassword = password
    },
    setUserNicname(state, nickname){
      state.userNickname = nickname
    },
    setThreads(state, threads){
      state.items[0] = threads
    },
    addThread(state, item){
      state.items[0]._embedded.threads.push(item)
    }
  },
  actions: {
  },
  modules: {
  }
})
