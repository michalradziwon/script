
  package gen;
  public class C_Gen1 {
  		@com.google.inject.Inject
  		public C_Gen1(C_Gen2 c_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  