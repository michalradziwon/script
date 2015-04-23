
  package gen;
  public class C_Gen135 {
  		@com.google.inject.Inject
  		public C_Gen135(C_Gen136 c_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  