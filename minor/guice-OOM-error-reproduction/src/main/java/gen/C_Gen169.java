
  package gen;
  public class C_Gen169 {
  		@com.google.inject.Inject
  		public C_Gen169(C_Gen170 c_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  