
  package gen;
  public class C_Gen14 {
  		@com.google.inject.Inject
  		public C_Gen14(C_Gen15 c_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  