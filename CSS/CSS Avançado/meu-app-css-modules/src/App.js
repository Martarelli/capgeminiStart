import logo from './logo.svg';
import style from './App.module.css';
import novoStyle from './NovoCss.module.css';

function App() {
  return (
    <div className={style.App}>
      <header className={novoStyle['App-header']}>
        <img src={logo} className={style['App-logo']} alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className={style['App-link']}
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
