
  package gen;
  public class E_Gen68 {
  		@com.google.inject.Inject
  		public E_Gen68(E_Gen69 e_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  