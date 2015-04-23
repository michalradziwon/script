
  package gen;
  public class C_Gen166 {
  		@com.google.inject.Inject
  		public C_Gen166(C_Gen167 c_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  