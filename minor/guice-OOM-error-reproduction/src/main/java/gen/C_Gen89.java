
  package gen;
  public class C_Gen89 {
  		@com.google.inject.Inject
  		public C_Gen89(C_Gen90 c_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  