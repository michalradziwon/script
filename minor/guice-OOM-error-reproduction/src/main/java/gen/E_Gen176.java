
  package gen;
  public class E_Gen176 {
  		@com.google.inject.Inject
  		public E_Gen176(E_Gen177 e_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  