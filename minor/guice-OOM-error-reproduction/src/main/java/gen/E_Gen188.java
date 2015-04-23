
  package gen;
  public class E_Gen188 {
  		@com.google.inject.Inject
  		public E_Gen188(E_Gen189 e_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  