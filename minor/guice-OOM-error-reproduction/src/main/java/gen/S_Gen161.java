
  package gen;
  public class S_Gen161 {
  		@com.google.inject.Inject
  		public S_Gen161(S_Gen162 s_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  