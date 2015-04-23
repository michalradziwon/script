
  package gen;
  public class C_Gen63 {
  		@com.google.inject.Inject
  		public C_Gen63(C_Gen64 c_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  