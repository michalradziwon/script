
  package gen;
  public class D_Gen89 {
  		@com.google.inject.Inject
  		public D_Gen89(D_Gen90 d_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  