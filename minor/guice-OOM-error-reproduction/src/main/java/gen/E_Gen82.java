
  package gen;
  public class E_Gen82 {
  		@com.google.inject.Inject
  		public E_Gen82(E_Gen83 e_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  