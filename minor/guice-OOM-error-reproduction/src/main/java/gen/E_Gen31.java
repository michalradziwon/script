
  package gen;
  public class E_Gen31 {
  		@com.google.inject.Inject
  		public E_Gen31(E_Gen32 e_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  