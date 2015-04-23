
  package gen;
  public class C_Gen171 {
  		@com.google.inject.Inject
  		public C_Gen171(C_Gen172 c_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  