
  package gen;
  public class J_Gen89 {
  		@com.google.inject.Inject
  		public J_Gen89(J_Gen90 j_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  