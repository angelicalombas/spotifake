import './NavBar.styles.scss';
import { CgSignal } from 'react-icons/cg';
import { Link } from 'react-router-dom';


function NavBar() {
    return (
        <header className='container'>
            <nav className='container--nav'>
                <CgSignal size={35} />
                <Link to={'/'}>
                    <h1>SpotiFake</h1>
                </Link>
            </nav>
        </header>
    )

}

export default NavBar;