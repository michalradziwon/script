
  package gen;
  public class C_Gen39 {
  		@com.google.inject.Inject
  		public C_Gen39(C_Gen40 c_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  