
  package gen;
  public class C_Gen47 {
  		@com.google.inject.Inject
  		public C_Gen47(C_Gen48 c_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  