
  package gen;
  public class C_Gen84 {
  		@com.google.inject.Inject
  		public C_Gen84(C_Gen85 c_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  