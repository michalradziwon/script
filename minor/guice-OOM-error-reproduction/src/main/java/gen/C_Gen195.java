
  package gen;
  public class C_Gen195 {
  		@com.google.inject.Inject
  		public C_Gen195(C_Gen196 c_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  