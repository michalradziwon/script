
  package gen;
  public class C_Gen173 {
  		@com.google.inject.Inject
  		public C_Gen173(C_Gen174 c_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  