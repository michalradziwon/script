
  package gen;
  public class C_Gen143 {
  		@com.google.inject.Inject
  		public C_Gen143(C_Gen144 c_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  