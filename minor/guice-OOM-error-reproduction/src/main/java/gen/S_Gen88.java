
  package gen;
  public class S_Gen88 {
  		@com.google.inject.Inject
  		public S_Gen88(S_Gen89 s_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  