
  package gen;
  public class E_Gen172 {
  		@com.google.inject.Inject
  		public E_Gen172(E_Gen173 e_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  