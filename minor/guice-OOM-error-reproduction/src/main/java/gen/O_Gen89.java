
  package gen;
  public class O_Gen89 {
  		@com.google.inject.Inject
  		public O_Gen89(O_Gen90 o_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  