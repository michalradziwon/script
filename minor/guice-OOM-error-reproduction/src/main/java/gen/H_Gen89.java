
  package gen;
  public class H_Gen89 {
  		@com.google.inject.Inject
  		public H_Gen89(H_Gen90 h_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  