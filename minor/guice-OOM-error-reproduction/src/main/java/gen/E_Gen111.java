
  package gen;
  public class E_Gen111 {
  		@com.google.inject.Inject
  		public E_Gen111(E_Gen112 e_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  