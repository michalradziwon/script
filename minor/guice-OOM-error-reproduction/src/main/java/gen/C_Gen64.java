
  package gen;
  public class C_Gen64 {
  		@com.google.inject.Inject
  		public C_Gen64(C_Gen65 c_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  