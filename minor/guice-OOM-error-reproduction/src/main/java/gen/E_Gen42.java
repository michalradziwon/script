
  package gen;
  public class E_Gen42 {
  		@com.google.inject.Inject
  		public E_Gen42(E_Gen43 e_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  