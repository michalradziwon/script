
  package gen;
  public class C_Gen61 {
  		@com.google.inject.Inject
  		public C_Gen61(C_Gen62 c_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  