
  package gen;
  public class C_Gen194 {
  		@com.google.inject.Inject
  		public C_Gen194(C_Gen195 c_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  