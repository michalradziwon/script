
  package gen;
  public class E_Gen89 {
  		@com.google.inject.Inject
  		public E_Gen89(E_Gen90 e_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  