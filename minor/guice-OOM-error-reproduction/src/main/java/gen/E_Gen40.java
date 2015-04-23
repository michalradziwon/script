
  package gen;
  public class E_Gen40 {
  		@com.google.inject.Inject
  		public E_Gen40(E_Gen41 e_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  