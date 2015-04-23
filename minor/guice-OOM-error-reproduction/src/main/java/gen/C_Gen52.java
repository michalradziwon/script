
  package gen;
  public class C_Gen52 {
  		@com.google.inject.Inject
  		public C_Gen52(C_Gen53 c_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  