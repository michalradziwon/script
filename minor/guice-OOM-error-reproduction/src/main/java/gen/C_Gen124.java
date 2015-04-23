
  package gen;
  public class C_Gen124 {
  		@com.google.inject.Inject
  		public C_Gen124(C_Gen125 c_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  