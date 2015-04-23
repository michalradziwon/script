
  package gen;
  public class C_Gen174 {
  		@com.google.inject.Inject
  		public C_Gen174(C_Gen175 c_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  