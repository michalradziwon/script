
  package gen;
  public class E_Gen127 {
  		@com.google.inject.Inject
  		public E_Gen127(E_Gen128 e_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  