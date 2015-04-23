
  package gen;
  public class H_Gen88 {
  		@com.google.inject.Inject
  		public H_Gen88(H_Gen89 h_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  