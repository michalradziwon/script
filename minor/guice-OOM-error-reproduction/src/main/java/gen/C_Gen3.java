
  package gen;
  public class C_Gen3 {
  		@com.google.inject.Inject
  		public C_Gen3(C_Gen4 c_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  