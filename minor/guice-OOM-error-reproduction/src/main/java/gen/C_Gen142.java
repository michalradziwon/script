
  package gen;
  public class C_Gen142 {
  		@com.google.inject.Inject
  		public C_Gen142(C_Gen143 c_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  