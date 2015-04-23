
  package gen;
  public class C_Gen2 {
  		@com.google.inject.Inject
  		public C_Gen2(C_Gen3 c_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  