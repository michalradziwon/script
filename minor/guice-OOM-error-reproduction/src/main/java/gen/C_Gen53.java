
  package gen;
  public class C_Gen53 {
  		@com.google.inject.Inject
  		public C_Gen53(C_Gen54 c_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  