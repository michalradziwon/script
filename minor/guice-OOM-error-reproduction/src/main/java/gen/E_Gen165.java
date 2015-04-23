
  package gen;
  public class E_Gen165 {
  		@com.google.inject.Inject
  		public E_Gen165(E_Gen166 e_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  