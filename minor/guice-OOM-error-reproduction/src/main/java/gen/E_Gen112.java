
  package gen;
  public class E_Gen112 {
  		@com.google.inject.Inject
  		public E_Gen112(E_Gen113 e_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  