
  package gen;
  public class C_Gen73 {
  		@com.google.inject.Inject
  		public C_Gen73(C_Gen74 c_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  