
  package gen;
  public class L_Gen89 {
  		@com.google.inject.Inject
  		public L_Gen89(L_Gen90 l_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  