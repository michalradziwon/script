
  package gen;
  public class C_Gen149 {
  		@com.google.inject.Inject
  		public C_Gen149(C_Gen150 c_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  