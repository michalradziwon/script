
  package gen;
  public class E_Gen199 {
  		@com.google.inject.Inject
  		public E_Gen199(E_Gen200 e_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  