
  package gen;
  public class C_Gen88 {
  		@com.google.inject.Inject
  		public C_Gen88(C_Gen89 c_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  