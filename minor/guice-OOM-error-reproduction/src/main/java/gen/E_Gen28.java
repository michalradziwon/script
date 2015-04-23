
  package gen;
  public class E_Gen28 {
  		@com.google.inject.Inject
  		public E_Gen28(E_Gen29 e_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  