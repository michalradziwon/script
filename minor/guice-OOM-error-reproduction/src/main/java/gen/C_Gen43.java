
  package gen;
  public class C_Gen43 {
  		@com.google.inject.Inject
  		public C_Gen43(C_Gen44 c_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  