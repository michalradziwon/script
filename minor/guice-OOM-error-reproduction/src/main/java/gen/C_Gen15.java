
  package gen;
  public class C_Gen15 {
  		@com.google.inject.Inject
  		public C_Gen15(C_Gen16 c_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  