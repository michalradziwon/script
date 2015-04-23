
  package gen;
  public class E_Gen32 {
  		@com.google.inject.Inject
  		public E_Gen32(E_Gen33 e_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  