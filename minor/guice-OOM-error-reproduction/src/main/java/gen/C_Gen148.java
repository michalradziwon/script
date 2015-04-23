
  package gen;
  public class C_Gen148 {
  		@com.google.inject.Inject
  		public C_Gen148(C_Gen149 c_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  