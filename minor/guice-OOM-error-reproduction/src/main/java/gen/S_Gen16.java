
  package gen;
  public class S_Gen16 {
  		@com.google.inject.Inject
  		public S_Gen16(S_Gen17 s_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  