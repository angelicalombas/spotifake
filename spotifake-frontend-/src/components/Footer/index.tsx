import './Footer.styles.scss';
import { CgSignal } from 'react-icons/cg'

function Footer() {
    return (
        <footer>
            <nav className='container'>
                <CgSignal size={35} />
                <h1>SpotiFake</h1>
            </nav>
        </footer>
    )

}

export default Footer;