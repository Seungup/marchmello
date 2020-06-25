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
    docState: 'default',
    searchState : true,

    searchKeyword : '',
    searchTrigger : false,

    items : [
      new Threads(
        'lkjnlkjnthekjlthekjll ',
        'Foster thekjlthekjlthekjlthektthekjlthekjlthekjlthekjlhekjlthekjlthekjljlthekjlthekjlthekjl People',
        123
      ),
      new Threads(
          'lkjnlkjnl ',
          'Foster thekjl People',
          123
      ),
      new Threads(
          'lkjnlkjnl ',
          'Foster thekjl People',
          123
      ),  new Threads(
          'lkjnlkjnl ',
          'Foster thekjl People',
          123
      ),  new Threads(
          'lkjnlkjnl ',
          'Foster thekjl People',
          123
      ),  new Threads(
          'lkjnlkjnl ',
          'Foster thekjl People',
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
    }
  },
  actions: {
  },
  modules: {
  }
})
