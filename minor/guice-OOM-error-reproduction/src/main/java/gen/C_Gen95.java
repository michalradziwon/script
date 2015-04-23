
  package gen;
  public class C_Gen95 {
  		@com.google.inject.Inject
  		public C_Gen95(C_Gen96 c_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  