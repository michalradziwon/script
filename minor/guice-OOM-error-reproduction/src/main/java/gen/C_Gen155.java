
  package gen;
  public class C_Gen155 {
  		@com.google.inject.Inject
  		public C_Gen155(C_Gen156 c_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  