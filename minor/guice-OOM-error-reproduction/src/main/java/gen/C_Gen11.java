
  package gen;
  public class C_Gen11 {
  		@com.google.inject.Inject
  		public C_Gen11(C_Gen12 c_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  