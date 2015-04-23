
  package gen;
  public class E_Gen128 {
  		@com.google.inject.Inject
  		public E_Gen128(E_Gen129 e_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  