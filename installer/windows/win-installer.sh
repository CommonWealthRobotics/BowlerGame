SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

echo "Installing Inno IDE"
$SCRIPT_DIR/isetup-5.4.3.exe /verysilent /allusers
echo "Done Installing Inno IDE"
