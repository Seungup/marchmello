import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    // 문서 상태
    docState: 'default',

    // 검색
    searchKeyword : null,
    searchTrigger : false,
  },
  mutations: {
    setDocState (state, stateValue) {
      state.docState = stateValue
    },
    setSearchKeyword(state, searchKeyword) {
      state.searchKeyword = searchKeyword
      state.searchTrigger = true
    },
    setSearchKeywordNull(state) {
      state.searchKeyword = null
      state.searchTrigger = false
    }
  },
  actions: {
  },
  modules: {
  }
})
