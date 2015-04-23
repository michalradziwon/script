
  package gen;
  public class S_Gen89 {
  		@com.google.inject.Inject
  		public S_Gen89(S_Gen90 s_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  