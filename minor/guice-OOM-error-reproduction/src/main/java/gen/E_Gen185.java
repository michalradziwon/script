
  package gen;
  public class E_Gen185 {
  		@com.google.inject.Inject
  		public E_Gen185(E_Gen186 e_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  