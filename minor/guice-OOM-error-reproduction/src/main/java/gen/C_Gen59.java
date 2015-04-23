
  package gen;
  public class C_Gen59 {
  		@com.google.inject.Inject
  		public C_Gen59(C_Gen60 c_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  