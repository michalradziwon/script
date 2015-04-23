
  package gen;
  public class C_Gen45 {
  		@com.google.inject.Inject
  		public C_Gen45(C_Gen46 c_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  