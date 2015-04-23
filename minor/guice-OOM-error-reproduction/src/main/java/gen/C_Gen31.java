
  package gen;
  public class C_Gen31 {
  		@com.google.inject.Inject
  		public C_Gen31(C_Gen32 c_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  