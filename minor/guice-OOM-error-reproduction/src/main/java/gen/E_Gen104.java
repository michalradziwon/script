
  package gen;
  public class E_Gen104 {
  		@com.google.inject.Inject
  		public E_Gen104(E_Gen105 e_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  