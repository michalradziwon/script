
  package gen;
  public class C_Gen97 {
  		@com.google.inject.Inject
  		public C_Gen97(C_Gen98 c_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  