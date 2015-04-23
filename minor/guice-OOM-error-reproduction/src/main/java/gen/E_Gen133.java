
  package gen;
  public class E_Gen133 {
  		@com.google.inject.Inject
  		public E_Gen133(E_Gen134 e_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  