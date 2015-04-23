
  package gen;
  public class C_Gen170 {
  		@com.google.inject.Inject
  		public C_Gen170(C_Gen171 c_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  