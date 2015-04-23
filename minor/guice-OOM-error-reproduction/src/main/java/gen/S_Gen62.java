
  package gen;
  public class S_Gen62 {
  		@com.google.inject.Inject
  		public S_Gen62(S_Gen63 s_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  