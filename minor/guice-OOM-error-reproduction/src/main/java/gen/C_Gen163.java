
  package gen;
  public class C_Gen163 {
  		@com.google.inject.Inject
  		public C_Gen163(C_Gen164 c_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  