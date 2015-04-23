
  package gen;
  public class E_Gen65 {
  		@com.google.inject.Inject
  		public E_Gen65(E_Gen66 e_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  