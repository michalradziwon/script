
  package gen;
  public class D_Gen88 {
  		@com.google.inject.Inject
  		public D_Gen88(D_Gen89 d_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  