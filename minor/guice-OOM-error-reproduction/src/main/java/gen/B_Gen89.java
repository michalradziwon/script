
  package gen;
  public class B_Gen89 {
  		@com.google.inject.Inject
  		public B_Gen89(B_Gen90 b_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  