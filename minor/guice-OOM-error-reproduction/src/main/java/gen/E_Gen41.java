
  package gen;
  public class E_Gen41 {
  		@com.google.inject.Inject
  		public E_Gen41(E_Gen42 e_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  