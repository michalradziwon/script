
  package gen;
  public class E_Gen120 {
  		@com.google.inject.Inject
  		public E_Gen120(E_Gen121 e_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  