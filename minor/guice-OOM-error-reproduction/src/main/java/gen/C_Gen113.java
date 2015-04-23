
  package gen;
  public class C_Gen113 {
  		@com.google.inject.Inject
  		public C_Gen113(C_Gen114 c_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  