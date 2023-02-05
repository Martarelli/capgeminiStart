import './App.css';
import styled from 'styled-components';

const Titulo = styled.h1`
color: white;
text-decoration: underline;
`;

const Subtitulo = styled.h2`
color: green;
background-color: black;
`;
const Artigo = styled.section`
color: blue;
font-size: 1.2rem;
line-height: 2rem;
text-indent: 2rem;
`;
const Titulo2 = styled.h1`
color: red;
letter-spacing: 5px;
`;


function App() {
  return (
    <div className="App">
      <Titulo>Meu Site</Titulo>
      <Subtitulo>Subtitulo da Pagina</Subtitulo>
      <Artigo>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent hendrerit nunc augue, sit amet porttitor mi tincidunt in. Phasellus ante mi, accumsan vel nibh vitae, aliquam fermentum ligula. Cras scelerisque, turpis faucibus tincidunt interdum, odio mi finibus risus, in fermentum nisl mi ut quam. Praesent efficitur ipsum sed placerat consequat.</Artigo>
      <Titulo2>Segundo Titulo</Titulo2>
      <Artigo>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent hendrerit nunc augue, sit amet porttitor mi tincidunt in. Phasellus ante mi, accumsan vel nibh vitae, aliquam fermentum ligula. Cras scelerisque, turpis faucibus tincidunt interdum, odio mi finibus risus, in fermentum nisl mi ut quam. Praesent efficitur ipsum sed placerat consequat.</Artigo>
    </div>
  );
}

export default App;
