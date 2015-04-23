
  package gen;
  public class C_Gen154 {
  		@com.google.inject.Inject
  		public C_Gen154(C_Gen155 c_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  